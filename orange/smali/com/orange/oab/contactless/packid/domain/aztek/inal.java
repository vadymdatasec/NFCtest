public class inal extends java.lang.Enum {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lcom/orange/oab/contactless/packid/domain/aztek/AztecApplicationData; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x4019 */
/* name = "TransactionType" */
} // .end annotation
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/lang/Enum<", */
/* "Lcom/orange/oab/contactless/packid/domain/aztek/AztecApplicationData$TransactionType;", */
/* ">;" */
/* } */
} // .end annotation
/* # static fields */
public static final com.orange.oab.contactless.packid.domain.aztek.AztecApplicationData$TransactionType CREDIT;
public static final com.orange.oab.contactless.packid.domain.aztek.AztecApplicationData$TransactionType DEBIT;
public static final com.orange.oab.contactless.packid.domain.aztek.AztecApplicationData$TransactionType INIT;
public static final com.orange.oab.contactless.packid.domain.aztek.AztecApplicationData$TransactionType UNKNOWN;
public static final com.orange.oab.contactless.packid.domain.aztek.AztecApplicationData$TransactionType UPDATE;
public static final com.orange.oab.contactless.packid.domain.aztek.AztecApplicationData$TransactionType d; //synthetic
/* # instance fields */
public final Object b;
public final Integer c;
/* # direct methods */
public static inal ( ) {
/* .locals 9 */
/* .line 1 */
/* new-instance v0, Lcom/orange/oab/contactless/packid/domain/aztek/AztecApplicationData$TransactionType; */
int v2 = 0; // const/4 v2, 0x0
int v3 = 3; // const/4 v3, 0x3
final String v4 = "INIT"; // const-string v4, "INIT"
/* invoke-direct {v0, v4, v2, v3, v1}, Lcom/orange/oab/contactless/packid/domain/aztek/AztecApplicationData$TransactionType;-><init>(Ljava/lang/String;III)V */
/* .line 2 */
/* new-instance v0, Lcom/orange/oab/contactless/packid/domain/aztek/AztecApplicationData$TransactionType; */
int v4 = 1; // const/4 v4, 0x1
final String v5 = "CREDIT"; // const-string v5, "CREDIT"
/* invoke-direct {v0, v5, v4, v4, v1}, Lcom/orange/oab/contactless/packid/domain/aztek/AztecApplicationData$TransactionType;-><init>(Ljava/lang/String;III)V */
/* .line 3 */
/* new-instance v0, Lcom/orange/oab/contactless/packid/domain/aztek/AztecApplicationData$TransactionType; */
int v5 = 2; // const/4 v5, 0x2
final String v6 = "DEBIT"; // const-string v6, "DEBIT"
/* invoke-direct {v0, v6, v5, v5, v1}, Lcom/orange/oab/contactless/packid/domain/aztek/AztecApplicationData$TransactionType;-><init>(Ljava/lang/String;III)V */
/* .line 4 */
/* new-instance v0, Lcom/orange/oab/contactless/packid/domain/aztek/AztecApplicationData$TransactionType; */
int v6 = 4; // const/4 v6, 0x4
final String v7 = "UPDATE"; // const-string v7, "UPDATE"
/* invoke-direct {v0, v7, v3, v6, v1}, Lcom/orange/oab/contactless/packid/domain/aztek/AztecApplicationData$TransactionType;-><init>(Ljava/lang/String;III)V */
/* .line 5 */
/* new-instance v0, Lcom/orange/oab/contactless/packid/domain/aztek/AztecApplicationData$TransactionType; */
final String v7 = "UNKNOWN"; // const-string v7, "UNKNOWN"
/* const/16 v8, 0xff */
/* invoke-direct {v0, v7, v6, v8, v1}, Lcom/orange/oab/contactless/packid/domain/aztek/AztecApplicationData$TransactionType;-><init>(Ljava/lang/String;III)V */
int v1 = 5; // const/4 v1, 0x5
/* new-array v1, v1, [Lcom/orange/oab/contactless/packid/domain/aztek/AztecApplicationData$TransactionType; */
/* .line 6 */
v7 = com.orange.oab.contactless.packid.domain.aztek.AztecApplicationData$TransactionType.INIT;
/* aput-object v7, v1, v2 */
v2 = com.orange.oab.contactless.packid.domain.aztek.AztecApplicationData$TransactionType.CREDIT;
/* aput-object v2, v1, v4 */
v2 = com.orange.oab.contactless.packid.domain.aztek.AztecApplicationData$TransactionType.DEBIT;
/* aput-object v2, v1, v5 */
v2 = com.orange.oab.contactless.packid.domain.aztek.AztecApplicationData$TransactionType.UPDATE;
/* aput-object v2, v1, v3 */
/* aput-object v0, v1, v6 */
return;
} // .end method
public inal ( ) {
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(II)V" */
/* } */
} // .end annotation
/* .line 1 */
/* invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V */
/* .line 2 */
/* iput p4, p0, Lcom/orange/oab/contactless/packid/domain/aztek/AztecApplicationData$TransactionType;->c:I */
/* int-to-byte p1, p3 */
/* .line 3 */
/* iput-byte p1, p0, Lcom/orange/oab/contactless/packid/domain/aztek/AztecApplicationData$TransactionType;->b:B */
return;
} // .end method
public static com.orange.oab.contactless.packid.domain.aztek.AztecApplicationData$TransactionType a ( Object p0 ) { //synthethic
/* .locals 0 */
/* .line 1 */
com.orange.oab.contactless.packid.domain.aztek.AztecApplicationData$TransactionType .b ( p0 );
} // .end method
public static com.orange.oab.contactless.packid.domain.aztek.AztecApplicationData$TransactionType b ( Object p0 ) {
/* .locals 5 */
/* .line 1 */
com.orange.oab.contactless.packid.domain.aztek.AztecApplicationData$TransactionType .values ( );
/* array-length v1, v0 */
int v2 = 0; // const/4 v2, 0x0
} // :goto_0
/* if-ge v2, v1, :cond_1 */
/* aget-object v3, v0, v2 */
/* .line 2 */
/* iget-byte v4, v3, Lcom/orange/oab/contactless/packid/domain/aztek/AztecApplicationData$TransactionType;->b:B */
/* if-ne v4, p0, :cond_0 */
} // :cond_0
/* add-int/lit8 v2, v2, 0x1 */
/* .line 3 */
} // :cond_1
p0 = com.orange.oab.contactless.packid.domain.aztek.AztecApplicationData$TransactionType.UNKNOWN;
} // .end method
public static com.orange.oab.contactless.packid.domain.aztek.AztecApplicationData$TransactionType valueOf ( java.lang.String p0 ) {
/* .locals 1 */
/* .line 1 */
/* const-class v0, Lcom/orange/oab/contactless/packid/domain/aztek/AztecApplicationData$TransactionType; */
java.lang.Enum .valueOf ( v0,p0 );
/* check-cast p0, Lcom/orange/oab/contactless/packid/domain/aztek/AztecApplicationData$TransactionType; */
} // .end method
public static com.orange.oab.contactless.packid.domain.aztek.AztecApplicationData$TransactionType values ( ) {
/* .locals 1 */
/* .line 1 */
v0 = com.orange.oab.contactless.packid.domain.aztek.AztecApplicationData$TransactionType.d;
(( com.orange.oab.contactless.packid.domain.aztek.AztecApplicationData$TransactionType ) v0 ).clone ( ); // invoke-virtual {v0}, [Lcom/orange/oab/contactless/packid/domain/aztek/AztecApplicationData$TransactionType;->clone()Ljava/lang/Object;
/* check-cast v0, [Lcom/orange/oab/contactless/packid/domain/aztek/AztecApplicationData$TransactionType; */
} // .end method
/* # virtual methods */
public Integer getResourceId ( ) {
/* .locals 1 */
/* .line 1 */
/* iget v0, p0, Lcom/orange/oab/contactless/packid/domain/aztek/AztecApplicationData$TransactionType;->c:I */
} // .end method
