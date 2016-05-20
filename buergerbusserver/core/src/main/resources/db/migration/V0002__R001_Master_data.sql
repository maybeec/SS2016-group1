INSERT INTO bus(id, modificationCounter, numberPlate, color, picture,lineId, "TIMESTAMP") VALUES
                           (1, 0, 'bus1numberPlate', 'blue', 'bus1pic.jpg',1, '2004-10-19 10:23:54'),
                           (2, 0, 'bus2numberPlate', 'blue', 'bus2pic.jpg',1, '2004-10-19 10:23:54'),
                           (3, 0, 'bus3numberPlate', 'blue', 'bus3pic.jpg',2, '2004-10-19 10:23:54'),
                           (4, 0, 'bus4numberPlate', 'blue', 'bus4pic.jpg',2, '2004-10-19 10:23:54'),
                           (5, 0, 'bus5numberPlate', 'blue', 'bus5pic.jpg',3, '2004-10-19 10:23:54');


INSERT INTO line(id, modificationcounter, name, routeId, "TIMESTAMP")VALUES
				       (1, 0, 'line1name', 1, '2004-10-19 10:23:54'),
					   (2, 0, 'line2name', 2, '2004-10-19 10:23:54'),
					   (3, 0, 'line3name', 3, '2004-10-19 10:23:54');

INSERT INTO ROUTE(id, modificationcounter,GPSData, "TIMESTAMP")
    VALUES (1,0,'11.968046,-12.420307;11.968046,-12.420307;11.968046,-12.420307','2004-10-19 10:23:54'),
                 (2,0,'21.968046,-22.420307;21.968046,-22.420307;21.968046,-22.420307','2004-10-19 10:23:54'),
                 (3,0,'31.968046,-32.420307;31.968046,-32.420307;31.968046,-32.420307','2004-10-19 10:23:54'),
                 (4,0,'41.968046,-42.420307;41.968046,-42.420307;41.968046,-42.420307','2004-10-19 10:23:54');

--added by Hafiz
INSERT INTO LASTPOSITION(id,busId, modificationCounter, lat, lon, "TIMESTAMP") VALUES
                 (1,5,0, 11.968046,-12.420307,'2004-10-19 10:23:54'),
                 (2,4,0, 21.968046,-22.420307,'2004-10-19 10:23:54'),
                 (3,3,0, 31.968046,-32.420307,'2004-10-19 10:23:54'),
                 (4,2,0, 41.968046,-42.420307,'2004-10-19 10:23:54'),
                 (5,1,0, 51.968046,-52.420307,'2004-10-19 10:23:54');
--------------------------------------------------
INSERT INTO STOP(
            id, modificationcounter,name, lat, lon, "TIMESTAMP")
    VALUES (1,0,'stop1', 11.968046,-12.420307,'2004-10-19 10:23:54'),
                 (2,0,'stop2', 21.968046,-22.420307,'2004-10-19 10:23:54'),
                 (3,0,'stop3', 31.968046,-32.420307,'2004-10-19 10:23:54'),
                 (4,0,'stop4', 41.968046,-42.420307,'2004-10-19 10:23:54'),
                 (5,0,'stop5', 51.968046,-52.420307,'2004-10-19 10:23:54');

INSERT INTO line_stop( id, line_id, stop_id, "TIMESTAMP") VALUES
		     (1, 1, 1, '2004-10-19 10:23:54'),
		     (2, 1, 2, '2004-10-19 10:23:54'),
		     (3, 1, 3, '2004-10-19 10:23:54'),
		     (4, 2, 4, '2004-10-19 10:23:54'),
		     (5, 2, 5, '2004-10-19 10:23:54');



INSERT INTO schedule(
            id, modificationcounter, lineName, stopId, arrivingTime, "TIMESTAMP") values
----- stops for line 1
            (1, 0, 'line name1', 1, '1:1:1', '2004-10-19 10:23:54'),
            (2, 0, 'line name1', 1, '1:1:2', '2004-10-19 10:23:54'),
            (3, 0, 'line name1', 1, '1:1:3', '2004-10-19 10:23:54'),

            (4, 0, 'line name1', 2, '1:2:1', '2004-10-19 10:23:54'),
            (5, 0, 'line name1', 2, '1:2:2', '2004-10-19 10:23:54'),
            (6, 0, 'line name1', 2, '1:2:3', '2004-10-19 10:23:54'),

            (7, 0, 'line name1', 3, '1:3:1', '2004-10-19 10:23:54'),
            (8, 0, 'line name1', 3, '1:3:2', '2004-10-19 10:23:54'),
            (9, 0, 'line name1', 3, '1:3:3', '2004-10-19 10:23:54'),

------------------- stops for the line2

            (10, 0, 'line name', 4, '2:4:1', '2004-10-19 10:23:54'),
            (11, 0, 'line name', 4, '2:4:2', '2004-10-19 10:23:54'),
            (12, 0, 'line name', 4, '2:4:3', '2004-10-19 10:23:54'),

            (13, 0, 'line name2', 5, '2:5:1', '2004-10-19 10:23:54'),
            (14, 0, 'line name2', 5, '2:5:2', '2004-10-19 10:23:54'),
            (15, 0, 'line name2', 5, '2:5:3', '2004-10-19 10:23:54');


