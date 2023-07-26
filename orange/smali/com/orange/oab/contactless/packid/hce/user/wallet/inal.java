public class inal extends java.lang.Enum {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/lang/Enum<", */
	 /* "Lcom/orange/oab/contactless/packid/hce/user/wallet/BadgeStatus;", */
	 /* ">;" */
	 /* } */
} // .end annotation
/* # static fields */
public static final com.orange.oab.contactless.packid.hce.user.wallet.BadgeStatus DELETION_FAILURE;
public static final com.orange.oab.contactless.packid.hce.user.wallet.BadgeStatus INSTALLATION_FAILURE;
public static final com.orange.oab.contactless.packid.hce.user.wallet.BadgeStatus INSTALLED;
public static final com.orange.oab.contactless.packid.hce.user.wallet.BadgeStatus INSTALLING;
public static final com.orange.oab.contactless.packid.hce.user.wallet.BadgeStatus b; //synthetic
/* # direct methods */
public static inal ( ) {
	 /* .locals 7 */
	 /* .line 1 */
	 /* new-instance v0, Lcom/orange/oab/contactless/packid/hce/user/wallet/BadgeStatus; */
	 int v1 = 0; // const/4 v1, 0x0
	 final String v2 = "INSTALLING"; // const-string v2, "INSTALLING"
	 /* invoke-direct {v0, v2, v1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/BadgeStatus;-><init>(Ljava/lang/String;I)V */
	 /* .line 2 */
	 /* new-instance v0, Lcom/orange/oab/contactless/packid/hce/user/wallet/BadgeStatus; */
	 int v2 = 1; // const/4 v2, 0x1
	 final String v3 = "INSTALLED"; // const-string v3, "INSTALLED"
	 /* invoke-direct {v0, v3, v2}, Lcom/orange/oab/contactless/packid/hce/user/wallet/BadgeStatus;-><init>(Ljava/lang/String;I)V */
	 /* .line 3 */
	 /* new-instance v0, Lcom/orange/oab/contactless/packid/hce/user/wallet/BadgeStatus; */
	 int v3 = 2; // const/4 v3, 0x2
	 final String v4 = "DELETION_FAILURE"; // const-string v4, "DELETION_FAILURE"
	 /* invoke-direct {v0, v4, v3}, Lcom/orange/oab/contactless/packid/hce/user/wallet/BadgeStatus;-><init>(Ljava/lang/String;I)V */
	 /* .line 4 */
	 /* new-instance v0, Lcom/orange/oab/contactless/packid/hce/user/wallet/BadgeStatus; */
	 int v4 = 3; // const/4 v4, 0x3
	 final String v5 = "INSTALLATION_FAILURE"; // const-string v5, "INSTALLATION_FAILURE"
	 /* invoke-direct {v0, v5, v4}, Lcom/orange/oab/contactless/packid/hce/user/wallet/BadgeStatus;-><init>(Ljava/lang/String;I)V */
	 int v5 = 4; // const/4 v5, 0x4
	 /* new-array v5, v5, [Lcom/orange/oab/contactless/packid/hce/user/wallet/BadgeStatus; */
	 /* .line 5 */
	 v6 = com.orange.oab.contactless.packid.hce.user.wallet.BadgeStatus.INSTALLING;
	 /* aput-object v6, v5, v1 */
	 v1 = com.orange.oab.contactless.packid.hce.user.wallet.BadgeStatus.INSTALLED;
	 /* aput-object v1, v5, v2 */
	 v1 = com.orange.oab.contactless.packid.hce.user.wallet.BadgeStatus.DELETION_FAILURE;
	 /* aput-object v1, v5, v3 */
	 /* aput-object v0, v5, v4 */
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
public static com.orange.oab.contactless.packid.hce.user.wallet.BadgeStatus valueOf ( java.lang.String p0 ) {
/* .locals 1 */
/* .line 1 */
/* const-class v0, Lcom/orange/oab/contactless/packid/hce/user/wallet/BadgeStatus; */
java.lang.Enum .valueOf ( v0,p0 );
/* check-cast p0, Lcom/orange/oab/contactless/packid/hce/user/wallet/BadgeStatus; */
} // .end method
public static com.orange.oab.contactless.packid.hce.user.wallet.BadgeStatus values ( ) {
/* .locals 1 */
/* .line 1 */
v0 = com.orange.oab.contactless.packid.hce.user.wallet.BadgeStatus.b;
(( com.orange.oab.contactless.packid.hce.user.wallet.BadgeStatus ) v0 ).clone ( ); // invoke-virtual {v0}, [Lcom/orange/oab/contactless/packid/hce/user/wallet/BadgeStatus;->clone()Ljava/lang/Object;
/* check-cast v0, [Lcom/orange/oab/contactless/packid/hce/user/wallet/BadgeStatus; */
} // .end method
