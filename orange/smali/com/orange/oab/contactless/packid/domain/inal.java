public class inal extends java.lang.Enum {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/lang/Enum<", */
	 /* "Lcom/orange/oab/contactless/packid/domain/ConditionToBeginTransaction;", */
	 /* ">;" */
	 /* } */
} // .end annotation
/* # static fields */
public static final com.orange.oab.contactless.packid.domain.ConditionToBeginTransaction b; //synthetic
public static final com.orange.oab.contactless.packid.domain.ConditionToBeginTransaction none;
public static final com.orange.oab.contactless.packid.domain.ConditionToBeginTransaction unlockPhoneRequired;
/* # direct methods */
public static inal ( ) {
	 /* .locals 5 */
	 /* .line 1 */
	 /* new-instance v0, Lcom/orange/oab/contactless/packid/domain/ConditionToBeginTransaction; */
	 int v1 = 0; // const/4 v1, 0x0
	 final String v2 = "none"; // const-string v2, "none"
	 /* invoke-direct {v0, v2, v1}, Lcom/orange/oab/contactless/packid/domain/ConditionToBeginTransaction;-><init>(Ljava/lang/String;I)V */
	 /* new-instance v0, Lcom/orange/oab/contactless/packid/domain/ConditionToBeginTransaction; */
	 int v2 = 1; // const/4 v2, 0x1
	 final String v3 = "unlockPhoneRequired"; // const-string v3, "unlockPhoneRequired"
	 /* invoke-direct {v0, v3, v2}, Lcom/orange/oab/contactless/packid/domain/ConditionToBeginTransaction;-><init>(Ljava/lang/String;I)V */
	 int v3 = 2; // const/4 v3, 0x2
	 /* new-array v3, v3, [Lcom/orange/oab/contactless/packid/domain/ConditionToBeginTransaction; */
	 /* .line 2 */
	 v4 = com.orange.oab.contactless.packid.domain.ConditionToBeginTransaction.none;
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
public static com.orange.oab.contactless.packid.domain.ConditionToBeginTransaction valueOf ( java.lang.String p0 ) {
/* .locals 1 */
/* .line 1 */
/* const-class v0, Lcom/orange/oab/contactless/packid/domain/ConditionToBeginTransaction; */
java.lang.Enum .valueOf ( v0,p0 );
/* check-cast p0, Lcom/orange/oab/contactless/packid/domain/ConditionToBeginTransaction; */
} // .end method
public static com.orange.oab.contactless.packid.domain.ConditionToBeginTransaction values ( ) {
/* .locals 1 */
/* .line 1 */
v0 = com.orange.oab.contactless.packid.domain.ConditionToBeginTransaction.b;
(( com.orange.oab.contactless.packid.domain.ConditionToBeginTransaction ) v0 ).clone ( ); // invoke-virtual {v0}, [Lcom/orange/oab/contactless/packid/domain/ConditionToBeginTransaction;->clone()Ljava/lang/Object;
/* check-cast v0, [Lcom/orange/oab/contactless/packid/domain/ConditionToBeginTransaction; */
} // .end method
