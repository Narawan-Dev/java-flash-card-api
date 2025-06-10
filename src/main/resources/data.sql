-- หมวดหมู่
INSERT INTO flash_card_category (id, front_category_name, back_category_name) VALUES
(1, 'body', 'ร่างกาย'),
(2, 'kitchen', 'ครัว');

-- คำศัพท์หมวด body
INSERT INTO flash_card (id, front_title, front_description, back_title, back_description, back_image, category_id) VALUES
(1, 'face', 'เฟซ', 'ใบหน้า', NULL, 'face.png', 1),
(2, 'eye', 'อาย', 'ตา', NULL, 'eye.png', 1),
(3, 'ear', 'เอียร์', 'หู', NULL, 'ear.png', 1),
(4, 'earlobe', 'เอียร์โลบ', 'ติ่งหู', NULL, 'earlobe.png', 1),
(5, 'nose', 'โนส', 'จมูก', NULL, 'nose.png', 1),
(6, 'nostril', 'โนสทริล', 'รูจมูก', NULL, 'nostril.png', 1);

-- คำศัพท์หมวด kitchen
INSERT INTO flash_card (id, front_title, front_description, back_title, back_description, back_image, category_id) VALUES
(7, 'spoon', 'สปูน', 'ช้อน', NULL, 'spoon.jpg', 2),
(8, 'fork', 'ฟอร์ค', 'ส้อม', NULL, 'fork.jpg', 2),
(9, 'knife', 'ไนฟ์', 'มีด', NULL, 'knife.jpg', 2);
