public abstract class ynthetic {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static final a; //synthetic
	 /* # direct methods */
	 public static ynthetic ( ) {
		 /* .locals 3 */
		 /* .line 1 */
		 com.orange.oab.contactless.packid.ble.ContactlessTransaction$EventType .values ( );
		 /* array-length v0, v0 */
		 /* new-array v0, v0, [I */
		 try { // :try_start_0
			 v1 = com.orange.oab.contactless.packid.ble.ContactlessTransaction$EventType.START;
			 v1 = 			 (( java.lang.Enum ) v1 ).ordinal ( ); // invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I
			 int v2 = 1; // const/4 v2, 0x1
			 /* aput v2, v0, v1 */
			 /* :try_end_0 */
			 /* .catch Ljava/lang/NoSuchFieldError; {:try_start_0 ..:try_end_0} :catch_0 */
			 /* :catch_0 */
			 try { // :try_start_1
				 v0 = e.h.b.a.l.x0.a;
				 v1 = com.orange.oab.contactless.packid.ble.ContactlessTransaction$EventType.DONE;
				 v1 = 				 (( java.lang.Enum ) v1 ).ordinal ( ); // invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I
				 int v2 = 2; // const/4 v2, 0x2
				 /* aput v2, v0, v1 */
				 /* :try_end_1 */
				 /* .catch Ljava/lang/NoSuchFieldError; {:try_start_1 ..:try_end_1} :catch_1 */
				 /* :catch_1 */
				 try { // :try_start_2
					 v0 = e.h.b.a.l.x0.a;
					 v1 = com.orange.oab.contactless.packid.ble.ContactlessTransaction$EventType.ERROR;
					 v1 = 					 (( java.lang.Enum ) v1 ).ordinal ( ); // invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I
					 int v2 = 3; // const/4 v2, 0x3
					 /* aput v2, v0, v1 */
					 /* :try_end_2 */
					 /* .catch Ljava/lang/NoSuchFieldError; {:try_start_2 ..:try_end_2} :catch_2 */
					 /* :catch_2 */
					 try { // :try_start_3
						 v0 = e.h.b.a.l.x0.a;
						 v1 = com.orange.oab.contactless.packid.ble.ContactlessTransaction$EventType.INTERRUPTED;
						 v1 = 						 (( java.lang.Enum ) v1 ).ordinal ( ); // invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I
						 int v2 = 4; // const/4 v2, 0x4
						 /* aput v2, v0, v1 */
						 /* :try_end_3 */
						 /* .catch Ljava/lang/NoSuchFieldError; {:try_start_3 ..:try_end_3} :catch_3 */
						 /* :catch_3 */
						 try { // :try_start_4
							 v0 = e.h.b.a.l.x0.a;
							 v1 = com.orange.oab.contactless.packid.ble.ContactlessTransaction$EventType.INSUFFICIENT_SECURITY;
							 v1 = 							 (( java.lang.Enum ) v1 ).ordinal ( ); // invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I
							 int v2 = 5; // const/4 v2, 0x5
							 /* aput v2, v0, v1 */
							 /* :try_end_4 */
							 /* .catch Ljava/lang/NoSuchFieldError; {:try_start_4 ..:try_end_4} :catch_4 */
							 /* :catch_4 */
							 return;
						 } // .end method
