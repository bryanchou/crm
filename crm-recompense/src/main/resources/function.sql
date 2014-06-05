﻿insert into t_auth_function
  (FID,
   FFUNCTIONCODE,
   FFUNCTIONNAME,
   FURI,
   FFUNCTIONLEVEL,
   FPARENTCODE,
   FVALIDFLAG,
   FINVALIDDATE,
   FVALIDDATE,
   FDISPLAYORDER,
   FISCHECK,
   FFUNCTIONTYPE,
   FFUNCTIONDESC,
   FFUNCTIONSEQ,
   FCREATEUSERID,
   FCREATETIME,
   FLASTMODIFYUSERID,
   FLASTUPDATETIME)
values
  (function_seq.nextval,
   '01004002001',
   '取消初步处理',
   '/recompense/cancleRecompense.action',
   5,
   '01004002',
   1,
   '12-4月 -09 12.16.19.000000 上午',
   '',
   1,
   1,
   4,
   '取消初步处理',
   '0/01/01004/01004002/01004002001',
   1,
   '12-4月 -09 12.16.19.000000 上午',
   1,
   '12-3月 -12 12.16.19.000000 上午');

insert into t_auth_function
  (FID,
   FFUNCTIONCODE,
   FFUNCTIONNAME,
   FURI,
   FFUNCTIONLEVEL,
   FPARENTCODE,
   FVALIDFLAG,
   FINVALIDDATE,
   FVALIDDATE,
   FDISPLAYORDER,
   FISCHECK,
   FFUNCTIONTYPE,
   FFUNCTIONDESC,
   FFUNCTIONSEQ,
   FCREATEUSERID,
   FCREATETIME,
   FLASTMODIFYUSERID,
   FLASTUPDATETIME)
values
  (function_seq.nextval,
   '01004002002',
   '金额确认',
   '/recompense/amountRecognized.action',
   5,
   '01004002',
   1,
   '12-4月 -09 12.16.19.000000 上午',
   '',
   2,
   1,
   4,
   '金额确认',
   '0/01/01004/01004002/01004002002',
   1,
   '12-4月 -09 12.16.19.000000 上午',
   1,
   '12-3月 -12 12.16.19.000000 上午');

insert into t_auth_function
  (FID,
   FFUNCTIONCODE,
   FFUNCTIONNAME,
   FURI,
   FFUNCTIONLEVEL,
   FPARENTCODE,
   FVALIDFLAG,
   FINVALIDDATE,
   FVALIDDATE,
   FDISPLAYORDER,
   FISCHECK,
   FFUNCTIONTYPE,
   FFUNCTIONDESC,
   FFUNCTIONSEQ,
   FCREATEUSERID,
   FCREATETIME,
   FLASTMODIFYUSERID,
   FLASTUPDATETIME)
values
  (function_seq.nextval,
   '01004002003',
   '初步处理',
   '/recompense/processRecompense.action',
   5,
   '01004002',
   1,
   '12-4月 -09 12.16.19.000000 上午',
   '',
   3,
   1,
   4,
   '初步处理',
   '0/01/01004/01004002/01004002003',
   1,
   '12-4月 -09 12.16.19.000000 上午',
   1,
   '12-3月 -12 12.16.19.000000 上午');



insert into t_auth_function (FID, FFUNCTIONCODE, FFUNCTIONNAME, FURI, FFUNCTIONLEVEL, FPARENTCODE, FVALIDFLAG, FINVALIDDATE, FVALIDDATE, FDISPLAYORDER, FISCHECK, FFUNCTIONTYPE, FFUNCTIONDESC, FFUNCTIONSEQ, FCREATEUSERID, FCREATETIME, FLASTMODIFYUSERID, FLASTUPDATETIME)
values (function_seq.nextval, '01004002004', '付款', '/recompense/payment.action', 5, '01004002', 1, '', '', 6, 1, 4, '付款', '0/01/01004/01004002/01004002004', 1, '', 1, '');