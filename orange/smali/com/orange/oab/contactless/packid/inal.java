public class inal extends java.lang.Enum {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/lang/Enum<", */
	 /* "Lcom/orange/oab/contactless/packid/ContactlessType;", */
	 /* ">;" */
	 /* } */
} // .end annotation
/* # static fields */
public static final com.orange.oab.contactless.packid.ContactlessType BLE;
public static final com.orange.oab.contactless.packid.ContactlessType NFC;
public static final com.orange.oab.contactless.packid.ContactlessType NFC_AND_BLE;
public static final com.orange.oab.contactless.packid.ContactlessType NFC_OR_BLE;
public static final com.orange.oab.contactless.packid.ContactlessType PERSONALISED;
public static final com.orange.oab.contactless.packid.ContactlessType b; //synthetic
/* # direct methods */
public static inal ( ) {
	 /* .locals 3 */
	 /* .line 1 */
	 /* new-instance v0, Lcom/orange/oab/contactless/packid/ContactlessType; */
	 final String v1 = "NFC"; // const-string v1, "NFC"
	 int v2 = 0; // const/4 v2, 0x0
	 /* invoke-direct {v0, v1, v2}, Lcom/orange/oab/contactless/packid/ContactlessType;-><init>(Ljava/lang/String;I)V */
	 /* .line 2 */
	 /* new-instance v0, Lcom/orange/oab/contactless/packid/ContactlessType; */
	 final String v1 = "BLE"; // const-string v1, "BLE"
	 int v2 = 1; // const/4 v2, 0x1
	 /* invoke-direct {v0, v1, v2}, Lcom/orange/oab/contactless/packid/ContactlessType;-><init>(Ljava/lang/String;I)V */
	 /* .line 3 */
	 /* new-instance v0, Lcom/orange/oab/contactless/packid/ContactlessType; */
	 final String v1 = "NFC_AND_BLE"; // const-string v1, "NFC_AND_BLE"
	 int v2 = 2; // const/4 v2, 0x2
	 /* invoke-direct {v0, v1, v2}, Lcom/orange/oab/contactless/packid/ContactlessType;-><init>(Ljava/lang/String;I)V */
	 /* .line 4 */
	 /* new-instance v0, Lcom/orange/oab/contactless/packid/ContactlessType; */
	 final String v1 = "NFC_OR_BLE"; // const-string v1, "NFC_OR_BLE"
	 int v2 = 3; // const/4 v2, 0x3
	 /* invoke-direct {v0, v1, v2}, Lcom/orange/oab/contactless/packid/ContactlessType;-><init>(Ljava/lang/String;I)V */
	 /* .line 5 */
	 /* new-instance v0, Lcom/orange/oab/contactless/packid/ContactlessType; */
	 final String v1 = "PERSONALISED"; // const-string v1, "PERSONALISED"
	 int v2 = 4; // const/4 v2, 0x4
	 /* invoke-direct {v0, v1, v2}, Lcom/orange/oab/contactless/packid/ContactlessType;-><init>(Ljava/lang/String;I)V */
	 com.orange.oab.contactless.packid.ContactlessType .a ( );
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
public static final com.orange.oab.contactless.packid.ContactlessType a ( ) { //synthethic
/* .locals 3 */
int v0 = 5; // const/4 v0, 0x5
/* new-array v0, v0, [Lcom/orange/oab/contactless/packid/ContactlessType; */
v1 = com.orange.oab.contactless.packid.ContactlessType.NFC;
int v2 = 0; // const/4 v2, 0x0
/* aput-object v1, v0, v2 */
v1 = com.orange.oab.contactless.packid.ContactlessType.BLE;
int v2 = 1; // const/4 v2, 0x1
/* aput-object v1, v0, v2 */
v1 = com.orange.oab.contactless.packid.ContactlessType.NFC_AND_BLE;
int v2 = 2; // const/4 v2, 0x2
/* aput-object v1, v0, v2 */
v1 = com.orange.oab.contactless.packid.ContactlessType.NFC_OR_BLE;
int v2 = 3; // const/4 v2, 0x3
/* aput-object v1, v0, v2 */
v1 = com.orange.oab.contactless.packid.ContactlessType.PERSONALISED;
int v2 = 4; // const/4 v2, 0x4
/* aput-object v1, v0, v2 */
} // .end method
public static com.orange.oab.contactless.packid.ContactlessType valueOf ( java.lang.String p0 ) {
/* .locals 1 */
/* const-class v0, Lcom/orange/oab/contactless/packid/ContactlessType; */
java.lang.Enum .valueOf ( v0,p0 );
/* check-cast p0, Lcom/orange/oab/contactless/packid/ContactlessType; */
} // .end method
public static com.orange.oab.contactless.packid.ContactlessType values ( ) {
/* .locals 1 */
v0 = com.orange.oab.contactless.packid.ContactlessType.b;
(( java.lang.Object ) v0 ).clone ( ); // invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;
/* check-cast v0, [Lcom/orange/oab/contactless/packid/ContactlessType; */
} // .end method
