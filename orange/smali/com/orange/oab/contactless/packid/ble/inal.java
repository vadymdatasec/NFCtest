public class inal extends java.lang.Enum {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lcom/orange/oab/contactless/packid/ble/ContactlessTransaction; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x4019 */
/* name = "EventType" */
} // .end annotation
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/lang/Enum<", */
/* "Lcom/orange/oab/contactless/packid/ble/ContactlessTransaction$EventType;", */
/* ">;" */
/* } */
} // .end annotation
/* # static fields */
public static final com.orange.oab.contactless.packid.ble.ContactlessTransaction$EventType DONE;
public static final com.orange.oab.contactless.packid.ble.ContactlessTransaction$EventType ERROR;
public static final com.orange.oab.contactless.packid.ble.ContactlessTransaction$EventType INSUFFICIENT_SECURITY;
public static final com.orange.oab.contactless.packid.ble.ContactlessTransaction$EventType INTERRUPTED;
public static final com.orange.oab.contactless.packid.ble.ContactlessTransaction$EventType START;
public static final com.orange.oab.contactless.packid.ble.ContactlessTransaction$EventType b; //synthetic
/* # direct methods */
public static inal ( ) {
/* .locals 8 */
/* .line 1 */
/* new-instance v0, Lcom/orange/oab/contactless/packid/ble/ContactlessTransaction$EventType; */
int v1 = 0; // const/4 v1, 0x0
final String v2 = "START"; // const-string v2, "START"
/* invoke-direct {v0, v2, v1}, Lcom/orange/oab/contactless/packid/ble/ContactlessTransaction$EventType;-><init>(Ljava/lang/String;I)V */
/* new-instance v0, Lcom/orange/oab/contactless/packid/ble/ContactlessTransaction$EventType; */
int v2 = 1; // const/4 v2, 0x1
final String v3 = "ERROR"; // const-string v3, "ERROR"
/* invoke-direct {v0, v3, v2}, Lcom/orange/oab/contactless/packid/ble/ContactlessTransaction$EventType;-><init>(Ljava/lang/String;I)V */
/* new-instance v0, Lcom/orange/oab/contactless/packid/ble/ContactlessTransaction$EventType; */
int v3 = 2; // const/4 v3, 0x2
final String v4 = "INTERRUPTED"; // const-string v4, "INTERRUPTED"
/* invoke-direct {v0, v4, v3}, Lcom/orange/oab/contactless/packid/ble/ContactlessTransaction$EventType;-><init>(Ljava/lang/String;I)V */
/* new-instance v0, Lcom/orange/oab/contactless/packid/ble/ContactlessTransaction$EventType; */
int v4 = 3; // const/4 v4, 0x3
final String v5 = "INSUFFICIENT_SECURITY"; // const-string v5, "INSUFFICIENT_SECURITY"
/* invoke-direct {v0, v5, v4}, Lcom/orange/oab/contactless/packid/ble/ContactlessTransaction$EventType;-><init>(Ljava/lang/String;I)V */
/* new-instance v0, Lcom/orange/oab/contactless/packid/ble/ContactlessTransaction$EventType; */
int v5 = 4; // const/4 v5, 0x4
final String v6 = "DONE"; // const-string v6, "DONE"
/* invoke-direct {v0, v6, v5}, Lcom/orange/oab/contactless/packid/ble/ContactlessTransaction$EventType;-><init>(Ljava/lang/String;I)V */
int v6 = 5; // const/4 v6, 0x5
/* new-array v6, v6, [Lcom/orange/oab/contactless/packid/ble/ContactlessTransaction$EventType; */
/* .line 2 */
v7 = com.orange.oab.contactless.packid.ble.ContactlessTransaction$EventType.START;
/* aput-object v7, v6, v1 */
v1 = com.orange.oab.contactless.packid.ble.ContactlessTransaction$EventType.ERROR;
/* aput-object v1, v6, v2 */
v1 = com.orange.oab.contactless.packid.ble.ContactlessTransaction$EventType.INTERRUPTED;
/* aput-object v1, v6, v3 */
v1 = com.orange.oab.contactless.packid.ble.ContactlessTransaction$EventType.INSUFFICIENT_SECURITY;
/* aput-object v1, v6, v4 */
/* aput-object v0, v6, v5 */
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
public static com.orange.oab.contactless.packid.ble.ContactlessTransaction$EventType valueOf ( java.lang.String p0 ) {
/* .locals 1 */
/* .line 1 */
/* const-class v0, Lcom/orange/oab/contactless/packid/ble/ContactlessTransaction$EventType; */
java.lang.Enum .valueOf ( v0,p0 );
/* check-cast p0, Lcom/orange/oab/contactless/packid/ble/ContactlessTransaction$EventType; */
} // .end method
public static com.orange.oab.contactless.packid.ble.ContactlessTransaction$EventType values ( ) {
/* .locals 1 */
/* .line 1 */
v0 = com.orange.oab.contactless.packid.ble.ContactlessTransaction$EventType.b;
(( com.orange.oab.contactless.packid.ble.ContactlessTransaction$EventType ) v0 ).clone ( ); // invoke-virtual {v0}, [Lcom/orange/oab/contactless/packid/ble/ContactlessTransaction$EventType;->clone()Ljava/lang/Object;
/* check-cast v0, [Lcom/orange/oab/contactless/packid/ble/ContactlessTransaction$EventType; */
} // .end method
