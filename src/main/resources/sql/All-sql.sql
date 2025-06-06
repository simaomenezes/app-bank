-- Notice

INSERT INTO notice_details (notice_id, notice_summary, notice_details, notic_beg_dt, notic_end_dt, create_dt, update_dt)
VALUES (1,'Home Loan Interest rates reduced', 'Home loan interest rates are reduced as per the goverment guidelines. The updated rates will be effective immediately',
NOW() - INTERVAL '30 DAY', NOW() + INTERVAL '30 DAY', NOW(), null);

INSERT INTO notice_details (notice_id, notice_summary, notice_details, notic_beg_dt, notic_end_dt, create_dt, update_dt)
VALUES (2,'Net Banking Offers', 'Customers who will opt for Internet banking while opening a saving account will get a $50 amazon voucher',
NOW() - INTERVAL '30 DAY', NOW() + INTERVAL '30 DAY', NOW(), null);

INSERT INTO notice_details (notice_id, notice_summary, notice_details, notic_beg_dt, notic_end_dt, create_dt, update_dt)
VALUES (3,'Mobile App Downtime', 'The mobile application of the EazyBank will be down from 2AM-5AM on 12/05/2020 due to maintenance activities',
NOW() - INTERVAL '30 DAY', NOW() + INTERVAL '30 DAY', NOW(), null);

INSERT INTO notice_details (notice_id, notice_summary, notice_details, notic_beg_dt, notic_end_dt, create_dt, update_dt)
VALUES (4,'E Auction notice', 'There will be a e-auction on 12/08/2020 on the Bank website for all the stubborn arrears.Interested parties can participate in the e-auction',
NOW() - INTERVAL '30 DAY', NOW() + INTERVAL '30 DAY', NOW(), null);

INSERT INTO notice_details (notice_id, notice_summary, notice_details, notic_beg_dt, notic_end_dt, create_dt, update_dt)
VALUES (5,'Launch of Millennia Cards', 'Millennia Credit Cards are launched for the premium customers of EazyBank. With these cards, you will get 5% cashback for each purchase',
NOW() - INTERVAL '30 DAY', NOW() + INTERVAL '30 DAY', NOW(), null);

INSERT INTO notice_details (notice_id, notice_summary, notice_details, notic_beg_dt, notic_end_dt, create_dt, update_dt)
VALUES (6,'COVID-19 Insurance', 'EazyBank launched an insurance policy which will cover COVID-19 expenses. Please reach out to the branch for more details',
NOW() - INTERVAL '30 DAY', NOW() + INTERVAL '30 DAY', NOW(), null);


-- Loans

INSERT INTO loans (loan_number, customer_id, start_dt, loan_type, total_loan, amount_paid, outstanding_amount, create_dt)
 VALUES (1, 1, '2020-10-13', 'Home', 200000, 50000, 150000, '2020-10-13');

INSERT INTO loans (loan_number, customer_id, start_dt, loan_type, total_loan, amount_paid, outstanding_amount, create_dt)
 VALUES (2, 1, '2020-06-06', 'Vehicle', 40000, 10000, 30000, '2020-06-06');

INSERT INTO loans (loan_number, customer_id, start_dt, loan_type, total_loan, amount_paid, outstanding_amount, create_dt)
 VALUES (3, 1, '2018-02-14', 'Home', 50000, 10000, 40000, '2018-02-14');

INSERT INTO loans (loan_number, customer_id, start_dt, loan_type, total_loan, amount_paid, outstanding_amount, create_dt)
 VALUES (4, 1, '2018-02-14', 'Personal', 10000, 3500, 6500, '2018-02-14');

