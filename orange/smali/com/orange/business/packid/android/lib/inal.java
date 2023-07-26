public class inal extends java.lang.Enum {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/lang/Enum<", */
	 /* "Lcom/orange/business/packid/android/lib/TransactionErrorType;", */
	 /* ">;" */
	 /* } */
} // .end annotation
/* # static fields */
public static final com.orange.business.packid.android.lib.TransactionErrorType ABORT;
public static final com.orange.business.packid.android.lib.TransactionErrorType AUTHENTICATION;
public static final com.orange.business.packid.android.lib.TransactionErrorType CIPHER;
public static final com.orange.business.packid.android.lib.TransactionErrorType GATT_TIMEOUT;
public static final com.orange.business.packid.android.lib.TransactionErrorType READ_CHARACTERISTIC;
public static final com.orange.business.packid.android.lib.TransactionErrorType WRITE_CHARACTERISTIC;
public static final com.orange.business.packid.android.lib.TransactionErrorType WRITE_DESCRIPTOR;
public static final com.orange.business.packid.android.lib.TransactionErrorType b; //synthetic
/* # direct methods */
public static inal ( ) {
	 /* .locals 10 */
	 /* .line 1 */
	 /* new-instance v0, Lcom/orange/business/packid/android/lib/TransactionErrorType; */
	 int v1 = 0; // const/4 v1, 0x0
	 final String v2 = "WRITE_DESCRIPTOR"; // const-string v2, "WRITE_DESCRIPTOR"
	 /* invoke-direct {v0, v2, v1}, Lcom/orange/business/packid/android/lib/TransactionErrorType;-><init>(Ljava/lang/String;I)V */
	 /* new-instance v0, Lcom/orange/business/packid/android/lib/TransactionErrorType; */
	 int v2 = 1; // const/4 v2, 0x1
	 final String v3 = "READ_CHARACTERISTIC"; // const-string v3, "READ_CHARACTERISTIC"
	 /* invoke-direct {v0, v3, v2}, Lcom/orange/business/packid/android/lib/TransactionErrorType;-><init>(Ljava/lang/String;I)V */
	 /* new-instance v0, Lcom/orange/business/packid/android/lib/TransactionErrorType; */
	 int v3 = 2; // const/4 v3, 0x2
	 final String v4 = "WRITE_CHARACTERISTIC"; // const-string v4, "WRITE_CHARACTERISTIC"
	 /* invoke-direct {v0, v4, v3}, Lcom/orange/business/packid/android/lib/TransactionErrorType;-><init>(Ljava/lang/String;I)V */
	 /* new-instance v0, Lcom/orange/business/packid/android/lib/TransactionErrorType; */
	 int v4 = 3; // const/4 v4, 0x3
	 final String v5 = "GATT_TIMEOUT"; // const-string v5, "GATT_TIMEOUT"
	 /* invoke-direct {v0, v5, v4}, Lcom/orange/business/packid/android/lib/TransactionErrorType;-><init>(Ljava/lang/String;I)V */
	 /* new-instance v0, Lcom/orange/business/packid/android/lib/TransactionErrorType; */
	 int v5 = 4; // const/4 v5, 0x4
	 final String v6 = "CIPHER"; // const-string v6, "CIPHER"
	 /* invoke-direct {v0, v6, v5}, Lcom/orange/business/packid/android/lib/TransactionErrorType;-><init>(Ljava/lang/String;I)V */
	 /* new-instance v0, Lcom/orange/business/packid/android/lib/TransactionErrorType; */
	 int v6 = 5; // const/4 v6, 0x5
	 final String v7 = "ABORT"; // const-string v7, "ABORT"
	 /* invoke-direct {v0, v7, v6}, Lcom/orange/business/packid/android/lib/TransactionErrorType;-><init>(Ljava/lang/String;I)V */
	 /* new-instance v0, Lcom/orange/business/packid/android/lib/TransactionErrorType; */
	 int v7 = 6; // const/4 v7, 0x6
	 final String v8 = "AUTHENTICATION"; // const-string v8, "AUTHENTICATION"
	 /* invoke-direct {v0, v8, v7}, Lcom/orange/business/packid/android/lib/TransactionErrorType;-><init>(Ljava/lang/String;I)V */
	 int v8 = 7; // const/4 v8, 0x7
	 /* new-array v8, v8, [Lcom/orange/business/packid/android/lib/TransactionErrorType; */
	 /* .line 2 */
	 v9 = com.orange.business.packid.android.lib.TransactionErrorType.WRITE_DESCRIPTOR;
	 /* aput-object v9, v8, v1 */
	 v1 = com.orange.business.packid.android.lib.TransactionErrorType.READ_CHARACTERISTIC;
	 /* aput-object v1, v8, v2 */
	 v1 = com.orange.business.packid.android.lib.TransactionErrorType.WRITE_CHARACTERISTIC;
	 /* aput-object v1, v8, v3 */
	 v1 = com.orange.business.packid.android.lib.TransactionErrorType.GATT_TIMEOUT;
	 /* aput-object v1, v8, v4 */
	 v1 = com.orange.business.packid.android.lib.TransactionErrorType.CIPHER;
	 /* aput-object v1, v8, v5 */
	 v1 = com.orange.business.packid.android.lib.TransactionErrorType.ABORT;
	 /* aput-object v1, v8, v6 */
	 /* aput-object v0, v8, v7 */
	 return;
} // .end method
public inal ( ) {
	 /* .locals 0 */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "()V" */
	 /* } */
} // .end annotation
/* .line 1 */
/* invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V */
return;
} // .end method
public static com.orange.business.packid.android.lib.TransactionErrorType valueOf ( java.lang.String p0 ) {
/* .locals 1 */
/* .line 1 */
/* const-class v0, Lcom/orange/business/packid/android/lib/TransactionErrorType; */
java.lang.Enum .valueOf ( v0,p0 );
/* check-cast p0, Lcom/orange/business/packid/android/lib/TransactionErrorType; */
} // .end method
public static com.orange.business.packid.android.lib.TransactionErrorType values ( ) {
/* .locals 1 */
/* .line 1 */
v0 = com.orange.business.packid.android.lib.TransactionErrorType.b;
(( com.orange.business.packid.android.lib.TransactionErrorType ) v0 ).clone ( ); // invoke-virtual {v0}, [Lcom/orange/business/packid/android/lib/TransactionErrorType;->clone()Ljava/lang/Object;
/* check-cast v0, [Lcom/orange/business/packid/android/lib/TransactionErrorType; */
} // .end method
