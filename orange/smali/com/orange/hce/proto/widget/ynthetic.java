public abstract class ynthetic {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lcom/orange/hce/proto/widget/PackIdWidgetService; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x1009 */
/* name = null */
} // .end annotation
/* # static fields */
public static final a; //synthetic
public static final b; //synthetic
/* # direct methods */
public static ynthetic ( ) {
/* .locals 6 */
/* .line 1 */
com.orange.oab.contactless.packid.ble.ContactlessTransaction$EventType .values ( );
/* array-length v0, v0 */
/* new-array v0, v0, [I */
int v1 = 1; // const/4 v1, 0x1
try { // :try_start_0
	 v2 = com.orange.oab.contactless.packid.ble.ContactlessTransaction$EventType.START;
	 v2 = 	 (( java.lang.Enum ) v2 ).ordinal ( ); // invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I
	 /* aput v1, v0, v2 */
	 /* :try_end_0 */
	 /* .catch Ljava/lang/NoSuchFieldError; {:try_start_0 ..:try_end_0} :catch_0 */
	 /* :catch_0 */
	 int v0 = 2; // const/4 v0, 0x2
	 try { // :try_start_1
		 v2 = com.orange.hce.proto.widget.PackIdWidgetService$a.b;
		 v3 = com.orange.oab.contactless.packid.ble.ContactlessTransaction$EventType.DONE;
		 v3 = 		 (( java.lang.Enum ) v3 ).ordinal ( ); // invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I
		 /* aput v0, v2, v3 */
		 /* :try_end_1 */
		 /* .catch Ljava/lang/NoSuchFieldError; {:try_start_1 ..:try_end_1} :catch_1 */
		 /* :catch_1 */
		 int v2 = 3; // const/4 v2, 0x3
		 try { // :try_start_2
			 v3 = com.orange.hce.proto.widget.PackIdWidgetService$a.b;
			 v4 = com.orange.oab.contactless.packid.ble.ContactlessTransaction$EventType.ERROR;
			 v4 = 			 (( java.lang.Enum ) v4 ).ordinal ( ); // invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I
			 /* aput v2, v3, v4 */
			 /* :try_end_2 */
			 /* .catch Ljava/lang/NoSuchFieldError; {:try_start_2 ..:try_end_2} :catch_2 */
			 /* :catch_2 */
			 try { // :try_start_3
				 v3 = com.orange.hce.proto.widget.PackIdWidgetService$a.b;
				 v4 = com.orange.oab.contactless.packid.ble.ContactlessTransaction$EventType.INTERRUPTED;
				 v4 = 				 (( java.lang.Enum ) v4 ).ordinal ( ); // invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I
				 int v5 = 4; // const/4 v5, 0x4
				 /* aput v5, v3, v4 */
				 /* :try_end_3 */
				 /* .catch Ljava/lang/NoSuchFieldError; {:try_start_3 ..:try_end_3} :catch_3 */
				 /* :catch_3 */
				 try { // :try_start_4
					 v3 = com.orange.hce.proto.widget.PackIdWidgetService$a.b;
					 v4 = com.orange.oab.contactless.packid.ble.ContactlessTransaction$EventType.INSUFFICIENT_SECURITY;
					 v4 = 					 (( java.lang.Enum ) v4 ).ordinal ( ); // invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I
					 int v5 = 5; // const/4 v5, 0x5
					 /* aput v5, v3, v4 */
					 /* :try_end_4 */
					 /* .catch Ljava/lang/NoSuchFieldError; {:try_start_4 ..:try_end_4} :catch_4 */
					 /* .line 2 */
					 /* :catch_4 */
					 e.h.b.a.m.i .values ( );
					 /* array-length v3, v3 */
					 /* new-array v3, v3, [I */
					 try { // :try_start_5
						 v4 = e.h.b.a.m.i.f;
						 v4 = 						 (( java.lang.Enum ) v4 ).ordinal ( ); // invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I
						 /* aput v1, v3, v4 */
						 /* :try_end_5 */
						 /* .catch Ljava/lang/NoSuchFieldError; {:try_start_5 ..:try_end_5} :catch_5 */
						 /* :catch_5 */
						 try { // :try_start_6
							 v1 = com.orange.hce.proto.widget.PackIdWidgetService$a.a;
							 v3 = e.h.b.a.m.i.e;
							 v3 = 							 (( java.lang.Enum ) v3 ).ordinal ( ); // invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I
							 /* aput v0, v1, v3 */
							 /* :try_end_6 */
							 /* .catch Ljava/lang/NoSuchFieldError; {:try_start_6 ..:try_end_6} :catch_6 */
							 /* :catch_6 */
							 try { // :try_start_7
								 v0 = com.orange.hce.proto.widget.PackIdWidgetService$a.a;
								 v1 = e.h.b.a.m.i.g;
								 v1 = 								 (( java.lang.Enum ) v1 ).ordinal ( ); // invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I
								 /* aput v2, v0, v1 */
								 /* :try_end_7 */
								 /* .catch Ljava/lang/NoSuchFieldError; {:try_start_7 ..:try_end_7} :catch_7 */
								 /* :catch_7 */
								 return;
							 } // .end method
