public class inal extends java.lang.Enum {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lcom/orange/oab/contactless/packid/intent/Intent; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x4019 */
/* name = "UserLoadingErrorReason" */
} // .end annotation
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/lang/Enum<", */
/* "Lcom/orange/oab/contactless/packid/intent/Intent$UserLoadingErrorReason;", */
/* ">;" */
/* } */
} // .end annotation
/* # static fields */
public static final com.orange.oab.contactless.packid.intent.Intent$UserLoadingErrorReason ENCRYPTION_ERROR;
public static final com.orange.oab.contactless.packid.intent.Intent$UserLoadingErrorReason SERVER_UNREACHABLE;
public static final com.orange.oab.contactless.packid.intent.Intent$UserLoadingErrorReason b; //synthetic
/* # direct methods */
public static inal ( ) {
/* .locals 5 */
/* .line 1 */
/* new-instance v0, Lcom/orange/oab/contactless/packid/intent/Intent$UserLoadingErrorReason; */
int v1 = 0; // const/4 v1, 0x0
final String v2 = "SERVER_UNREACHABLE"; // const-string v2, "SERVER_UNREACHABLE"
/* invoke-direct {v0, v2, v1}, Lcom/orange/oab/contactless/packid/intent/Intent$UserLoadingErrorReason;-><init>(Ljava/lang/String;I)V */
/* .line 2 */
/* new-instance v0, Lcom/orange/oab/contactless/packid/intent/Intent$UserLoadingErrorReason; */
int v2 = 1; // const/4 v2, 0x1
final String v3 = "ENCRYPTION_ERROR"; // const-string v3, "ENCRYPTION_ERROR"
/* invoke-direct {v0, v3, v2}, Lcom/orange/oab/contactless/packid/intent/Intent$UserLoadingErrorReason;-><init>(Ljava/lang/String;I)V */
int v3 = 2; // const/4 v3, 0x2
/* new-array v3, v3, [Lcom/orange/oab/contactless/packid/intent/Intent$UserLoadingErrorReason; */
/* .line 3 */
v4 = com.orange.oab.contactless.packid.intent.Intent$UserLoadingErrorReason.SERVER_UNREACHABLE;
/* aput-object v4, v3, v1 */
/* aput-object v0, v3, v2 */
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
public static com.orange.oab.contactless.packid.intent.Intent$UserLoadingErrorReason valueOf ( java.lang.String p0 ) {
/* .locals 1 */
/* .line 1 */
/* const-class v0, Lcom/orange/oab/contactless/packid/intent/Intent$UserLoadingErrorReason; */
java.lang.Enum .valueOf ( v0,p0 );
/* check-cast p0, Lcom/orange/oab/contactless/packid/intent/Intent$UserLoadingErrorReason; */
} // .end method
public static com.orange.oab.contactless.packid.intent.Intent$UserLoadingErrorReason values ( ) {
/* .locals 1 */
/* .line 1 */
v0 = com.orange.oab.contactless.packid.intent.Intent$UserLoadingErrorReason.b;
(( com.orange.oab.contactless.packid.intent.Intent$UserLoadingErrorReason ) v0 ).clone ( ); // invoke-virtual {v0}, [Lcom/orange/oab/contactless/packid/intent/Intent$UserLoadingErrorReason;->clone()Ljava/lang/Object;
/* check-cast v0, [Lcom/orange/oab/contactless/packid/intent/Intent$UserLoadingErrorReason; */
} // .end method
