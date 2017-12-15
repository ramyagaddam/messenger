create table IF NOT EXISTS DataStoreMessage(id integer, reportReceiptId double, eventSource varchar(100), formDeleted boolean, status varchar(20));
ALTER TABLE DataStoreMessage ALTER COLUMN status SET DEFAULT 'UNPROCESSED';
INSERT INTO DataStoreMessage VALUES (1, 496025, 'inform', false, 'UNPROCESSED');
INSERT INTO DataStoreMessage VALUES (2, 496025, 'inform2', false, 'UNPROCESSED');
INSERT INTO DataStoreMessage VALUES (3, 496025, 'inform2', false, 'UNPROCESSED');
