#ifndef DESI_ESP_IMPORTANT_HACKS_H
#define DESI_ESP_IMPORTANT_HACKS_H

#include "socket.h"
#include <inttypes.h>
Request request;
Response response;

float x,y;
char extra[30];
int botCount,playerCount;
Color clr,clrHealth,clr360,clr360t;
int rL;
int gL;
int bL;
int aL;

int rB,gB,bB,aB;
int rS,gS,bS,aS;
int rH,gH,bH,aH;
int rA,gA,bA,aA;
int rT,gT,bT,aT;

Options options{1,0,3, false,1, false,201
};

void DrawESP(ESP esp, int screenWidth, int screenHeight) {
         botCount = 0;
         playerCount = 0;
         request.ScreenHeight = screenHeight;
         request.ScreenWidth = screenWidth;
         request.Mode = InitMode;
         request.options = options;
         send((void *) &request, sizeof(request));
         receive((void *) &response);

         esp.DrawTextName(Color(255, 0, 0), "",
                          Vec2(300, 50),
                          screenHeight / 35);
         esp.DrawTextTime(Color(255, 0, 0), "",
                          Vec2(100, 50),
                          screenHeight / 35);

         char hello[50] = "failed";
         if (response.Success) {
             if (options.openState == 0)
                 /*esp.DrawAimCircle(Color(255, 0, 0), Vec2(screenWidth / 2, screenHeight / 2),
                                   request.options.aimingRange, screenHeight / 500);*/
             esp.DrawCross(Color(0, 68, 255), "VGVsZWdyYW06QG5rcjAwNzEx",
                           Vec2(screenWidth / 2, screenHeight / 2), 20);
             esp.DrawCross2(Color(0, 68, 255), "VGVsZWdyYW06QG5rcjAwNzEx",
                            Vec2(screenWidth / 2, screenHeight / 2), 20);
             float textsize = screenHeight / 50;
             for (int i = 0; i < response.PlayerCount; i++) {
                 x = response.Players[i].HeadLocation.x;
                 y = response.Players[i].HeadLocation.y;


                 if (response.Players[i].isBot) {
                     botCount++;
                     clr.r = 0;
                     clr.g = 255;
                     clr.b = 255;
                     clr.a = 255;
                     clr360.r = 255;
                     clr360.g = 255;
                     clr360.b = 255;
                     clr360.a = 80;
                     clr360t.r = 0;
                     clr360t.g = 0;
                     clr360t.b = 0;
                     clr360t.a = 200;
                 } else {
                     playerCount++;
                     clr.r = 255;
                     clr.g = 0;
                     clr.b = 0;
                     clr.a = 255;
                     clr360.r = 255;
                     clr360.g = 0;
                     clr360.b = 0;
                     clr360.a = 0;
                     clr360t.r = 255;
                     clr360t.g = 255;
                     clr360t.b = 255;
                     clr360t.a = 0;
                 }
                 float magic_number = (response.Players[i].Distance * response.fov);
                 float mx = (screenWidth / 4) / magic_number;
                 float my = (screenWidth / 1.38) / magic_number;
                 float top = y - my + (screenWidth / 1.7) / magic_number;
                 float bottom = y + my + screenHeight / 4 / magic_number;
                 //  Vec2(screenWidth / 2 / 2 / 2, screenHeight / 8), textsize);

                 if (response.Players[i].HeadLocation.z != 1) {

                     if (x > -50 && x < screenWidth + 50) {//onScreen
                         if ((screenWidth / 2) >= (x - mx) && (screenHeight / 2) >= (top) &&
                             (screenWidth / 2) <= (response.Players[i].Bone.pelvis.x +
                                                   mx) &&
                             (screenHeight / 2) <= ((response.Players[i].Bone.lAn.y +
                                                     response.Players[i].Bone.rAn.y) /
                                                    2))
                             clr = Color().Green();
                         if (isPlayerBox && !response.Players[i].isBot)
                             esp.DrawBox(clr, screenHeight / 300, Vec2(x - mx, top),
                                         Vec2((response.Players[i].Bone.pelvis.x +
                                               mx +
                                               10)/*(response.Players[i].Bone.lAn.x+response.Players[i].Bone.rAn.x)/2*/,
                                              ((response.Players[i].Bone.lAn.y +
                                                response.Players[i].Bone.rAn.y) /
                                               2) + 10)/*Vec2(x + mx, bottom)*/);
                         else if (isPlayerBox && response.Players[i].isBot)
                             esp.DrawBoxBot(clr, screenHeight / 300, Vec2(x - mx, top),
                                            Vec2((response.Players[i].Bone.pelvis.x +
                                                  mx +
                                                  10)/*(response.Players[i].Bone.lAn.x+response.Players[i].Bone.rAn.x)/2*/,
                                                 ((response.Players[i].Bone.lAn.y +
                                                   response.Players[i].Bone.rAn.y) /
                                                  2) + 10)/*Vec2(x + mx, bottom)*/);
                         //}
                         if (isSkelton && response.Players[i].Bone.isBone &&
                             !response.Players[i].isBot) {  //Skelton
                             //esp.DrawHead(clr,Vec2(response.Players[i].Bone.neck.x,response.Players[i].Bone.neck.y),5);
                             esp.DrawSkeleton(clr, 1, Vec2(x, y),
                                              Vec2(response.Players[i].Bone.neck.x,
                                                   response.Players[i].Bone.neck.y));
                             esp.DrawSkeleton(clr, 1, Vec2(response.Players[i].Bone.neck.x,
                                                           response.Players[i].Bone.neck.y),
                                              Vec2(response.Players[i].Bone.cheast.x,
                                                   response.Players[i].Bone.cheast.y));
                             esp.DrawSkeleton(clr, 1, Vec2(response.Players[i].Bone.cheast.x,
                                                           response.Players[i].Bone.cheast.y),
                                              Vec2(response.Players[i].Bone.pelvis.x,
                                                   response.Players[i].Bone.pelvis.y));
                             esp.DrawSkeleton(clr, 1, Vec2(response.Players[i].Bone.neck.x,
                                                           response.Players[i].Bone.neck.y),
                                              Vec2(response.Players[i].Bone.lSh.x,
                                                   response.Players[i].Bone.lSh.y));
                             esp.DrawSkeleton(clr, 1, Vec2(response.Players[i].Bone.neck.x,
                                                           response.Players[i].Bone.neck.y),
                                              Vec2(response.Players[i].Bone.rSh.x,
                                                   response.Players[i].Bone.rSh.y));
                             esp.DrawSkeleton(clr, 1, Vec2(response.Players[i].Bone.lSh.x,
                                                           response.Players[i].Bone.lSh.y),
                                              Vec2(response.Players[i].Bone.lElb.x,
                                                   response.Players[i].Bone.lElb.y));
                             esp.DrawSkeleton(clr, 1, Vec2(response.Players[i].Bone.rSh.x,
                                                           response.Players[i].Bone.rSh.y),
                                              Vec2(response.Players[i].Bone.rElb.x,
                                                   response.Players[i].Bone.rElb.y));
                             esp.DrawSkeleton(clr, 1, Vec2(response.Players[i].Bone.lElb.x,
                                                           response.Players[i].Bone.lElb.y),
                                              Vec2(response.Players[i].Bone.lWr.x,
                                                   response.Players[i].Bone.lWr.y));
                             esp.DrawSkeleton(clr, 1, Vec2(response.Players[i].Bone.rElb.x,
                                                           response.Players[i].Bone.rElb.y),
                                              Vec2(response.Players[i].Bone.rWr.x,
                                                   response.Players[i].Bone.rWr.y));
                             esp.DrawSkeleton(clr, 1, Vec2(response.Players[i].Bone.pelvis.x,
                                                           response.Players[i].Bone.pelvis.y),
                                              Vec2(response.Players[i].Bone.lTh.x,
                                                   response.Players[i].Bone.lTh.y));
                             esp.DrawSkeleton(clr, 1, Vec2(response.Players[i].Bone.pelvis.x,
                                                           response.Players[i].Bone.pelvis.y),
                                              Vec2(response.Players[i].Bone.rTh.x,
                                                   response.Players[i].Bone.rTh.y));
                             esp.DrawSkeleton(clr, 1, Vec2(response.Players[i].Bone.lTh.x,
                                                           response.Players[i].Bone.lTh.y),
                                              Vec2(response.Players[i].Bone.lKn.x,
                                                   response.Players[i].Bone.lKn.y));
                             esp.DrawSkeleton(clr, 1, Vec2(response.Players[i].Bone.rTh.x,
                                                           response.Players[i].Bone.rTh.y),
                                              Vec2(response.Players[i].Bone.rKn.x,
                                                   response.Players[i].Bone.rKn.y));
                             esp.DrawSkeleton(clr, 1, Vec2(response.Players[i].Bone.lKn.x,
                                                           response.Players[i].Bone.lKn.y),
                                              Vec2(response.Players[i].Bone.lAn.x,
                                                   response.Players[i].Bone.lAn.y));
                             esp.DrawSkeleton(clr, 1, Vec2(response.Players[i].Bone.rKn.x,
                                                           response.Players[i].Bone.rKn.y),
                                              Vec2(response.Players[i].Bone.rAn.x,
                                                   response.Players[i].Bone.rAn.y));
                         } else if (isSkelton && response.Players[i].Bone.isBone &&
                                    response.Players[i].isBot) {  //Skelton
                             //esp.DrawHead(clr,Vec2(response.Players[i].Bone.neck.x,response.Players[i].Bone.neck.y),5);
                             esp.DrawSkeletonBot(clr, 1, Vec2(x, y),
                                                 Vec2(response.Players[i].Bone.neck.x,
                                                      response.Players[i].Bone.neck.y));
                             esp.DrawSkeletonBot(clr, 1, Vec2(response.Players[i].Bone.neck.x,
                                                              response.Players[i].Bone.neck.y),
                                                 Vec2(response.Players[i].Bone.cheast.x,
                                                      response.Players[i].Bone.cheast.y));
                             esp.DrawSkeletonBot(clr, 1, Vec2(response.Players[i].Bone.cheast.x,
                                                              response.Players[i].Bone.cheast.y),
                                                 Vec2(response.Players[i].Bone.pelvis.x,
                                                      response.Players[i].Bone.pelvis.y));
                             esp.DrawSkeletonBot(clr, 1, Vec2(response.Players[i].Bone.neck.x,
                                                              response.Players[i].Bone.neck.y),
                                                 Vec2(response.Players[i].Bone.lSh.x,
                                                      response.Players[i].Bone.lSh.y));
                             esp.DrawSkeletonBot(clr, 1, Vec2(response.Players[i].Bone.neck.x,
                                                              response.Players[i].Bone.neck.y),
                                                 Vec2(response.Players[i].Bone.rSh.x,
                                                      response.Players[i].Bone.rSh.y));
                             esp.DrawSkeletonBot(clr, 1, Vec2(response.Players[i].Bone.lSh.x,
                                                              response.Players[i].Bone.lSh.y),
                                                 Vec2(response.Players[i].Bone.lElb.x,
                                                      response.Players[i].Bone.lElb.y));
                             esp.DrawSkeletonBot(clr, 1, Vec2(response.Players[i].Bone.rSh.x,
                                                              response.Players[i].Bone.rSh.y),
                                                 Vec2(response.Players[i].Bone.rElb.x,
                                                      response.Players[i].Bone.rElb.y));
                             esp.DrawSkeletonBot(clr, 1, Vec2(response.Players[i].Bone.lElb.x,
                                                              response.Players[i].Bone.lElb.y),
                                                 Vec2(response.Players[i].Bone.lWr.x,
                                                      response.Players[i].Bone.lWr.y));
                             esp.DrawSkeletonBot(clr, 1, Vec2(response.Players[i].Bone.rElb.x,
                                                              response.Players[i].Bone.rElb.y),
                                                 Vec2(response.Players[i].Bone.rWr.x,
                                                      response.Players[i].Bone.rWr.y));
                             esp.DrawSkeletonBot(clr, 1, Vec2(response.Players[i].Bone.pelvis.x,
                                                              response.Players[i].Bone.pelvis.y),
                                                 Vec2(response.Players[i].Bone.lTh.x,
                                                      response.Players[i].Bone.lTh.y));
                             esp.DrawSkeletonBot(clr, 1, Vec2(response.Players[i].Bone.pelvis.x,
                                                              response.Players[i].Bone.pelvis.y),
                                                 Vec2(response.Players[i].Bone.rTh.x,
                                                      response.Players[i].Bone.rTh.y));
                             esp.DrawSkeletonBot(clr, 1, Vec2(response.Players[i].Bone.lTh.x,
                                                              response.Players[i].Bone.lTh.y),
                                                 Vec2(response.Players[i].Bone.lKn.x,
                                                      response.Players[i].Bone.lKn.y));
                             esp.DrawSkeletonBot(clr, 1, Vec2(response.Players[i].Bone.rTh.x,
                                                              response.Players[i].Bone.rTh.y),
                                                 Vec2(response.Players[i].Bone.rKn.x,
                                                      response.Players[i].Bone.rKn.y));
                             esp.DrawSkeletonBot(clr, 1, Vec2(response.Players[i].Bone.lKn.x,
                                                              response.Players[i].Bone.lKn.y),
                                                 Vec2(response.Players[i].Bone.lAn.x,
                                                      response.Players[i].Bone.lAn.y));
                             esp.DrawSkeletonBot(clr, 1, Vec2(response.Players[i].Bone.rKn.x,
                                                              response.Players[i].Bone.rKn.y),
                                                 Vec2(response.Players[i].Bone.rAn.x,
                                                      response.Players[i].Bone.rAn.y));
                         }

                         //Health
                             if (isPlayerHealth) {
                                 float healthLength = screenWidth / 60;
                                 if (healthLength < mx)
                                     healthLength = mx;
                                 if (response.Players[i].Health < 25)
                                     clrHealth = Color(255, 0, 0, 100);
                                 else if (response.Players[i].Health < 50)
                                     clrHealth = Color(255, 165, 0, 100);
                                 else if (response.Players[i].Health < 75)
                                     clrHealth = Color(255, 255, 0, 100);
                                 else
                                     clrHealth = Color(0, 255, 0, 100);
                                 if (response.Players[i].Health == 0)
                                     esp.DrawTextknok(Color(255, 0, 0), "Knocked",
                                                      Vec2(x - 25,
                                                           top - 80/*x, top - screenHeight / 225*/),
                                                      textsize);
                                 else {
                                     esp.DrawFilledRect3(clrHealth,
                                                         Vec2(x - healthLength,
                                                              top - screenHeight / 110),
                                                         Vec2(x - healthLength +
                                                              (2 * healthLength) *
                                                              response.Players[i].Health /
                                                              100, top - screenHeight / 225));
                                     esp.DrawRect2(Color(0, 0, 0), screenHeight / 660,
                                                   Vec2(x - healthLength, top - screenHeight / 110),
                                                   Vec2(x + healthLength,
                                                        top - screenHeight / 225));
                                 }
                             }


                         //Head
                         if (isPlayerHead && !response.Players[i].isBot)
                             esp.DrawHead(clr,
                                          Vec2(response.Players[i].HeadLocation.x,
                                               response.Players[i].HeadLocation.y),
                                          screenHeight / 12 / magic_number);
                         else if (isPlayerHead && response.Players[i].isBot)
                             esp.DrawHeadBot(clr,
                                             Vec2(response.Players[i].HeadLocation.x,
                                                  response.Players[i].HeadLocation.y),
                                             screenHeight / 12 / magic_number);
                       if (isNation)
                             esp.DrawNation(Color().White(), response.Players[i].PlayerNation,
                                            Vec2(x - 150, top - 60), 20);
                         //Name and distance
                         if (response.Players[i].isBot)
                             strcpy(response.Players[i].PlayerNameByte, "66:111:116:");
                        //Name and distance
                        if(true) {
                         if (isPlayerName && !response.Players[i].isBot) {
                             //        esp.DrawFilledRect(Color(0, 0, 0, 120), Vec2(x - 175, top - 18),
                             //                           Vec2(x + 175, top - 55));
                             esp.DrawName(Color().White(), response.Players[i].PlayerNameByte,
                                          response.Players[i].TeamID,
                                          Vec2(x, top - 28), textsize);
                         } else if (isPlayerName && response.Players[i].isBot) {
                             //        esp.DrawFilledRect(Color(0, 0, 0, 120), Vec2(x - 175, top - 18),
                             //                           Vec2(x + 175, top - 55));
                             esp.DrawNameBot(Color().White(), response.Players[i].PlayerNameByte,
                                             response.Players[i].TeamID,
                                             Vec2(x, top - 28), textsize);
                         }
                         if (isPlayerDist) {
                             sprintf(extra, "%0.0fm", response.Players[i].Distance);
                             //    esp.DrawFilledRect(Color(0, 0, 255, 255),Vec2(x + 105,top - 23),
                             //                       Vec2(x + 172,top - 50));
                             esp.DrawTextDistance(Color(255, 255, 255), extra,
                                                  Vec2(x + 140, top - 28),
                                                  textsize);
                         }
                         //weapon
                         if (isEnemyWeapon && response.Players[i].Weapon.isWeapon)
                             if (true) {
                                 //        esp.DrawFilledRect(Color(0, 0, 0, 120), Vec2(x - 100, top - 58),
                                 //                           Vec2(x + 100, top - 95));
                                 esp.DrawWeapon(Color(255, 255, 255), response.Players[i].Weapon.id,
                                                response.Players[i].Weapon.ammo,
                                                Vec2(x, top - 70), textsize);
                             }
                     }

                     }


                 }


                 //360 Alert

                 if (response.Players[i].HeadLocation.z == 1.0f) {
                     if (!isr360Alert)
                         continue;
                     if (y > screenHeight - screenHeight / 12)
                         y = screenHeight - screenHeight / 12;
                     else if (y < screenHeight / 12)
                         y = screenHeight / 12;
                     if (x < screenWidth / 2) {
                         sprintf(extra, "%0.0f m", response.Players[i].Distance);
                         if (response.Players[i].Distance > 200 && !response.Players[i].isBot)
                             clr360 = Color(255, 255, 0, 80);
                         esp.DrawFilledCircleright(clr360, Vec2(screenWidth, y),
                                              screenHeight / 18);
                         esp.DrawTextAltert(clr360t, extra,
                                            Vec2(screenWidth - screenWidth / 80, y), textsize);

                     } else {
                         sprintf(extra, "%0.0f m", response.Players[i].Distance);
                         if (response.Players[i].Distance > 200 && !response.Players[i].isBot)
                             clr360 = Color(255, 255, 0, 80);
                         esp.DrawFilledCircleleft(clr360, Vec2(0, y),
                                              screenHeight / 18);
                         esp.DrawTextAltert(clr360t, extra,
                                            Vec2(screenWidth / 80, y), textsize);
                     }
                 } else if (x < -screenWidth / 10 || x > screenWidth + screenWidth / 10) {
                     if (!isr360Alert)
                         continue;
                     if (y > screenHeight - screenHeight / 12)
                         y = screenHeight - screenHeight / 12;
                     else if (y < screenHeight / 12)
                         y = screenHeight / 12;
                     if (x > screenWidth / 2) {
                         sprintf(extra, "%0.0f m", response.Players[i].Distance);
                         if (response.Players[i].Distance > 200 && !response.Players[i].isBot)
                             clr360 = Color(255, 255, 0, 80);
                         esp.DrawFilledCircleright(clr360, Vec2(screenWidth, y),
                                              screenHeight / 18);
                         esp.DrawTextAltert(clr360t, extra,
                                            Vec2(screenWidth - screenWidth / 80, y), textsize);

                     } else {
                         sprintf(extra, "%0.0f m", response.Players[i].Distance);
                         if (response.Players[i].Distance > 200 && !response.Players[i].isBot)
                             clr360 = Color(255, 255, 0, 80);
                         esp.DrawFilledCircleleft(clr360, Vec2(0, y),
                                              screenHeight / 18);
                         esp.DrawTextAltert(clr360t, extra,
                                            Vec2(screenWidth / 80, y), textsize);
                     }
                 } else if (isPlayerLine)
                     if (response.Players[i].isBot) {
                         esp.DrawLineBot(clr, screenHeight / 500,
                                         Vec2(screenWidth / 2, 0/*screenHeight / 10.5 + 8*/),
                                         Vec2(x, top));
                     } else {
                         esp.DrawLine(clr, screenHeight / 500,
                                      Vec2(screenWidth / 2, 0), Vec2(x, top));
                     }


             }
             if (botCount + playerCount == 0 && isEnemyCount) {

                 esp.DrawFilledRect(Color(42, 250, 108, 12),
                                    Vec2(screenWidth / 2 - 84, 80 - 50),
                                    Vec2(screenWidth / 2 + 84, 110 - 50));
                 esp.DrawFilledRect(Color(42, 250, 108, 14),
                                    Vec2(screenWidth / 2 - 80, 80 - 50),
                                    Vec2(screenWidth / 2 + 80, 110 - 50));
                 esp.DrawFilledRect(Color(42, 250, 108, 16),
                                    Vec2(screenWidth / 2 - 76, 80 - 50),
                                    Vec2(screenWidth / 2 + 76, 110 - 50));
                 esp.DrawFilledRect(Color(42, 250, 108, 18),
                                    Vec2(screenWidth / 2 - 72, 80 - 50),
                                    Vec2(screenWidth / 2 + 72, 110 - 50));
                 esp.DrawFilledRect(Color(42, 250, 108, 20),
                                    Vec2(screenWidth / 2 - 68, 80 - 50),
                                    Vec2(screenWidth / 2 + 68, 110 - 50));
                 esp.DrawFilledRect(Color(42, 250, 108, 22),
                                    Vec2(screenWidth / 2 - 64, 80 - 50),
                                    Vec2(screenWidth / 2 + 64, 110 - 50));
                 esp.DrawFilledRect(Color(42, 250, 108, 24),
                                    Vec2(screenWidth / 2 - 60, 80 - 50),
                                    Vec2(screenWidth / 2 + 60, 110 - 50));
                 esp.DrawFilledRect(Color(42, 250, 108, 26),
                                    Vec2(screenWidth / 2 - 56, 80 - 50),
                                    Vec2(screenWidth / 2 + 56, 110 - 50));
                 esp.DrawFilledRect(Color(42, 250, 108, 28),
                                    Vec2(screenWidth / 2 - 52, 80 - 50),
                                    Vec2(screenWidth / 2 + 52, 110 - 50));
                 esp.DrawFilledRect(Color(42, 250, 108, 30),
                                    Vec2(screenWidth / 2 - 48, 80 - 50),
                                    Vec2(screenWidth / 2 + 48, 110 - 50));
                 esp.DrawFilledRect(Color(42, 250, 108, 32),
                                    Vec2(screenWidth / 2 - 44, 80 - 50),
                                    Vec2(screenWidth / 2 + 44, 110 - 50));
                 esp.DrawFilledRect(Color(42, 250, 108, 36),
                                    Vec2(screenWidth / 2 - 40, 80 - 50),
                                    Vec2(screenWidth / 2 + 40, 110 - 50));
                 esp.DrawFilledRect(Color(42, 250, 108, 38),
                                    Vec2(screenWidth / 2 - 36, 80 - 50),
                                    Vec2(screenWidth / 2 + 36, 110 - 50));
                 esp.DrawFilledRect(Color(42, 250, 108, 40),
                                    Vec2(screenWidth / 2 - 32, 80 - 50),
                                    Vec2(screenWidth / 2 + 32, 110 - 50));
                 esp.DrawFilledRect(Color(42, 250, 108, 45),
                                    Vec2(screenWidth / 2 - 28, 80 - 50),
                                    Vec2(screenWidth / 2 + 28, 110 - 50));
                 esp.DrawFilledRect(Color(42, 250, 108, 50),
                                    Vec2(screenWidth / 2 - 24, 80 - 50),
                                    Vec2(screenWidth / 2 + 24, 110 - 50));
                 esp.DrawFilledRect(Color(42, 250, 108, 60),
                                    Vec2(screenWidth / 2 - 20, 80 - 50),
                                    Vec2(screenWidth / 2 + 20, 110 - 50));
                 esp.DrawFilledRect(Color(42, 250, 108, 120),
                                    Vec2(screenWidth / 2 - 16, 80 - 50),
                                    Vec2(screenWidth / 2 + 16, 110 - 50));
                 if (isArabic)
                     esp.DrawText(Color(0, 0, 0), "امن",
                                  Vec2(screenWidth / 2, 104 - 50),
                                  22);
                 else
                     esp.DrawText(Color(0, 0, 0), "CLEAR",
                                  Vec2(screenWidth / 2, 104 - 50),
                                  22);

             }
             if (botCount + playerCount > 0 && isEnemyCount) {

                 int ENEM_ICON = 2;
                 int BOT_ICON = 3;

                 if (playerCount == 0)
                 {
                     ENEM_ICON = 0;
                 }
                 if (botCount == 0)
                 {
                     BOT_ICON = 1;
                 }

                 char cn[10];
                 sprintf(cn,"%d",playerCount);

                 char bt[10];
                 sprintf(bt,"%d",botCount);



                 esp.DrawOTH(Vec2(screenWidth/2 - (80), 60), ENEM_ICON);
                 esp.DrawOTH(Vec2(screenWidth/2, 60), BOT_ICON);

                 esp.DrawTextCount(Color(255,255,255,255), cn, Vec2(

                         screenWidth/2 - (20) , 87), 23);

                 esp.DrawTextCount(Color(255,255,255,255), bt, Vec2(

                         screenWidth/2 + (50) , 87), 23);
             }
             for (int i = 0; i < response.GrenadeCount; i++) {
                 if (!isGrenadeWarning)
                     continue;
                 esp.DrawText(Color(255, 0, 0), "Warning: Grenade",
                              Vec2(screenWidth / 2, screenHeight / 8), 30);
                 if (response.Grenade[i].Location.z != 1.0f) {
                     if (response.Grenade[i].type == 1)
                         esp.DrawText(Color(255, 0, 0), "Grenade",
                                      Vec2(response.Grenade[i].Location.x,
                                           response.Grenade[i].Location.y), textsize);
                     else
                         esp.DrawText(Color(255, 158, 89), "Molotov",
                                      Vec2(response.Grenade[i].Location.x,
                                           response.Grenade[i].Location.y), textsize);
                 }
             }
             for (int i = 0; i < response.VehicleCount; i++) {
                 if (response.Vehicles[i].Location.z != 1.0f) {
                     esp.DrawVehicles(response.Vehicles[i].VehicleName,
                                      response.Vehicles[i].Distance,
                                      Vec2(response.Vehicles[i].Location.x,
                                           response.Vehicles[i].Location.y), textsize);

                 }
             }
             for (int i = 0; i < response.ItemsCount; i++) {
                 if (response.Items[i].Location.z != 1.0f) {
                     esp.DrawItems(response.Items[i].ItemName, response.Items[i].Distance,
                                   Vec2(response.Items[i].Location.x, response.Items[i].Location.y),
                                   textsize);

                 }
             }

         } else {
             // esp.DebugText(hello);
             esp.DrawFilledRect(Color(255, 208, 0, 12),
                                Vec2(screenWidth / 2 - 84, 80 - 50),
                                Vec2(screenWidth / 2 + 84, 110 - 50));
             esp.DrawFilledRect(Color(255, 208, 0, 14),
                                Vec2(screenWidth / 2 - 80, 80 - 50),
                                Vec2(screenWidth / 2 + 80, 110 - 50));
             esp.DrawFilledRect(Color(255, 208, 0, 16),
                                Vec2(screenWidth / 2 - 76, 80 - 50),
                                Vec2(screenWidth / 2 + 76, 110 - 50));
             esp.DrawFilledRect(Color(255, 208, 0, 18),
                                Vec2(screenWidth / 2 - 72, 80 - 50),
                                Vec2(screenWidth / 2 + 72, 110 - 50));
             esp.DrawFilledRect(Color(255, 208, 0, 20),
                                Vec2(screenWidth / 2 - 68, 80 - 50),
                                Vec2(screenWidth / 2 + 68, 110 - 50));
             esp.DrawFilledRect(Color(255, 208, 0, 22),
                                Vec2(screenWidth / 2 - 64, 80 - 50),
                                Vec2(screenWidth / 2 + 64, 110 - 50));
             esp.DrawFilledRect(Color(255, 208, 0, 24),
                                Vec2(screenWidth / 2 - 60, 80 - 50),
                                Vec2(screenWidth / 2 + 60, 110 - 50));
             esp.DrawFilledRect(Color(255, 208, 0, 26),
                                Vec2(screenWidth / 2 - 56, 80 - 50),
                                Vec2(screenWidth / 2 + 56, 110 - 50));
             esp.DrawFilledRect(Color(255, 208, 0, 28),
                                Vec2(screenWidth / 2 - 52, 80 - 50),
                                Vec2(screenWidth / 2 + 52, 110 - 50));
             esp.DrawFilledRect(Color(255, 208, 0, 30),
                                Vec2(screenWidth / 2 - 48, 80 - 50),
                                Vec2(screenWidth / 2 + 48, 110 - 50));
             esp.DrawFilledRect(Color(255, 208, 0, 32),
                                Vec2(screenWidth / 2 - 44, 80 - 50),
                                Vec2(screenWidth / 2 + 44, 110 - 50));
             esp.DrawFilledRect(Color(255, 208, 0, 36),
                                Vec2(screenWidth / 2 - 40, 80 - 50),
                                Vec2(screenWidth / 2 + 40, 110 - 50));
             esp.DrawFilledRect(Color(255, 208, 0, 38),
                                Vec2(screenWidth / 2 - 36, 80 - 50),
                                Vec2(screenWidth / 2 + 36, 110 - 50));
             esp.DrawFilledRect(Color(255, 208, 0, 40),
                                Vec2(screenWidth / 2 - 32, 80 - 50),
                                Vec2(screenWidth / 2 + 32, 110 - 50));
             esp.DrawFilledRect(Color(255, 208, 0, 45),
                                Vec2(screenWidth / 2 - 28, 80 - 50),
                                Vec2(screenWidth / 2 + 28, 110 - 50));
             esp.DrawFilledRect(Color(255, 208, 0, 50),
                                Vec2(screenWidth / 2 - 24, 80 - 50),
                                Vec2(screenWidth / 2 + 24, 110 - 50));
             esp.DrawFilledRect(Color(255, 208, 0, 60),
                                Vec2(screenWidth / 2 - 20, 80 - 50),
                                Vec2(screenWidth / 2 + 20, 110 - 50));
             esp.DrawFilledRect(Color(255, 208, 0, 120),
                                Vec2(screenWidth / 2 - 16, 80 - 50),
                                Vec2(screenWidth / 2 + 16, 110 - 50));


             if (isArabic)
                 esp.DrawText(Color(0, 0, 0), "امن",
                              Vec2(screenWidth / 2, 104 - 50),
                              22);
             else
                 esp.DrawText(Color(0, 0, 0), "CLEAR",
                              Vec2(screenWidth / 2, 104 - 50),
                              25);
         }
}


#endif //DESI_ESP_IMPORTANT_HACKS_H
