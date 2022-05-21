                                                 /*CODE IS WRITTEN IN JAVA*/
		
		long t= System.currentTimeMillis();                                  /*STARTING TIME*/
		long end = t+1000;                               /*ENDING TIME WHICH IS EXACTLY AFTER 1 SECOND OR 1000 MILLISECOND*/
		int count=1;                                   /*VARIABLE COUNTING THE NUMBER OF IERATIONS IN 1 SECOND*/
		while(System.currentTimeMillis() < end) {                    /* THIS WHILE LOOP WILL KEEP RUNNING FOR 1 SECOND*/
		  
		  System.out.println(count);
		  count++;
		  
		}
