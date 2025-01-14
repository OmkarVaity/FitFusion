USE
`fitfusiondatabase`;

USE
`fitfusiondatabase`;

-- Insert data into User table
INSERT INTO User (id, username, password)
VALUES (1, 'john_doe', 'password123'),
       (2, 'jane_smith', 'securepass'),
       (3, 'fitness_guru', 'fitpass123'),
       (4, 'workout_master', 'strongpass'),
       (5, 'healthy_living', 'healthypass'),
       (6, 'active_lifestyle', 'activepass'),
       (7, 'wellness_lover', 'wellnesspass'),
       (8, 'gym_enthusiast', 'gympass'),
       (9, 'exercise_addict', 'fitaddict'),
       (10, 'fit_and_fab', 'fabpass'),
       (11, 'train_hard', 'hardpass'),
       (12, 'train_smart', 'smartpass'),
       (13, 'cardio_king', 'cardiopass'),
       (14, 'strength_queen', 'strengthpass'),
       (15, 'mindful_mover', 'mindfulpass'),
       (16, 'yoga_lover', 'yogapass'),
       (17, 'pilates_pro', 'pilatespass'),
       (18, 'fit_mom', 'fitmomsrock'),
       (19, 'fit_dad', 'fitdadsrule'),
       (20, 'health_nut', 'nuttyandfit'),
       (21, 'running_free', 'freerunner'),
       (22, 'weightlifter101', 'liftweights'),
       (23, 'power_yogi', 'yogipower'),
       (24, 'crossfit_warrior', 'crossfitpass'),
       (25, 'hiker_explorer', 'hikingadventures'),
       (26, 'meditation_master', 'zenmaster'),
       (27, 'swimming_champ', 'swimmer123'),
       (28, 'cycling_enthusiast', 'cyclerider'),
       (29, 'team_sports_fan', 'teamsportsfan'),
       (30, 'nutrition_guru', 'nutritionist'),
       (31, 'marathon_runner', 'runlongrunstrong'),
       (32, 'soccer_star', 'soccerpassion'),
       (33, 'tennis_pro', 'tennisace'),
       (34, 'healthy_cook', 'cleancooking'),
       (35, 'vegetarian_fit', 'veggiepower'),
       (36, 'vegan_athlete', 'veganpower'),
       (37, 'mind-body_balance', 'balancepass'),
       (38, 'trail_running_pro', 'trailrunner'),
       (39, 'home_workout_hero', 'homeworkouts'),
       (40, 'outdoor_fitness', 'getfitoutside');


-- Insert data into Customer table
INSERT INTO Customer (user_Id, fitness_plan_id)
VALUES (1, 1), -- User ID 1 is associated with FitnessPlan ID 1
       (2, 2),
       (3, 3),
       (4, 4),
       (5, 5),
       (6, 6),
       (7, 7),
       (8, 8),
       (9, 9),
       (10, 10),
       (11, 11),
       (12, 12),
       (13, 13),
       (14, 14),
       (15, 15),
       (16, 16),
       (17, 17),
       (18, 18),
       (19, 19),
       (20, 20);

USE
`fitfusiondatabase`;

-- Insert data into Trainer table
INSERT INTO Trainer (user_id, wage)
VALUES (21, 50.0), -- User ID 21 is a trainer with a wage of $50.0
       (22, 45.0),
       (23, 55.0),
       (24, 60.0),
       (25, 40.0),
       (26, 65.0),
       (27, 55.0),
       (28, 50.0),
       (29, 48.0),
       (30, 52.0),
       (31, 53.0),
       (32, 58.0),
       (33, 47.0),
       (34, 55.0),
       (35, 45.0),
       (36, 50.0),
       (37, 56.0),
       (38, 42.0),
       (39, 49.0),
       (40, 60.0);


