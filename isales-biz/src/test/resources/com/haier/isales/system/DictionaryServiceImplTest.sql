INSERT INTO isales_sys.t_qn_dictionary_busintype 
  (BUSINTYPE_ID, BUSINTYPE_NAME) 
  VALUES ('test_dictionary_busin_guo', '这是测试字典组');
INSERT INTO isales_sys.t_qn_dictionary
  (BUSINTYPE_ID, BUSIN_ID, BUSIN_NAME, PRIVILEGE, STATUS, keyword) VALUES
  ('test_dictionary_busin_guo','101','这是测试字典项101' ,1, 1, 'testKey101'),
  ('test_dictionary_busin_guo','102','这是测试字典项102' ,1, 1, 'testKey102'),
  ('test_dictionary_busin_guo','103','这是测试字典项103' ,1, 1, 'testKey103'),
  ('test_dictionary_busin_guo','104','这是测试字典项104' ,1, 1, 'testKey104'),
  ('test_dictionary_busin_guo','105','这是测试字典项105' ,1, 1, 'testKey105'),
  ('test_dictionary_busin_guo','106','这是测试字典项106' ,1, 0, 'testKey106')
  ;
