INSERT INTO isales_sys.t_qn_label(
  label_id,
  label_code,
  label_name,
  parent_org,
  label_level,
  label_seq,
  label_status,
  update_id,
  update_name,
  update_time,
  create_id,
  create_name,
  create_time 
)
  VALUES (-99999,
  '12001',
  'test_label_2014121001',
  '',
  1,
  -99999,
  '101',
  1,
  '1',
  now(),
  1,
  '1',
  now()
  );

INSERT INTO isales_sys.t_qn_label_group(
  group_id, group_name,
  group_status,
  is_shared,
  update_id,
  update_name,
  update_time,
  create_id,
  create_name,
  create_time
  )
  VALUES (-88888, 'test_group_2014121001',
  '101',
  false,
 1,
  '1',
  now(),
  1,
  '1',
  now()
  );
INSERT INTO isales_sys.t_qn_label_group_ref(
  label_id, group_id)
  VALUES (-99999, -88888);


