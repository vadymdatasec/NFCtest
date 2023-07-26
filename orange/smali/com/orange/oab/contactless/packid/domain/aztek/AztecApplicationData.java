public class com.orange.oab.contactless.packid.domain.aztek.AztecApplicationData implements java.io.Serializable {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Lcom/orange/oab/contactless/packid/domain/aztek/AztecApplicationData$TransactionType; */
	 /* } */
} // .end annotation
/* # static fields */
public static final Integer APPLICATION_DATA_SIZE;
public static final fr.mbs.binary.Octets MASK_FOR_YEAR_MONTH_DAY;
/* # instance fields */
public Integer b;
public java.lang.String c;
public com.orange.oab.contactless.packid.domain.aztek.AztecApplicationData$TransactionType d;
public Object e;
public java.util.Date f;
/* # direct methods */
public static com.orange.oab.contactless.packid.domain.aztek.AztecApplicationData ( ) {
	 /* .locals 1 */
	 final String v0 = "FF1F3F3F7F"; // const-string v0, "FF1F3F3F7F"
	 /* .line 1 */
	 fr.mbs.binary.Octets .createOctets ( v0 );
	 return;
} // .end method
public com.orange.oab.contactless.packid.domain.aztek.AztecApplicationData ( ) {
	 /* .locals 0 */
	 /* .line 1 */
	 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
	 return;
} // .end method
public static java.util.Date a ( fr.mbs.binary.Octets p0 ) {
	 /* .locals 2 */
	 /* .annotation system Ldalvik/annotation/Throws; */
	 /* value = { */
	 /* Ljava/text/ParseException; */
	 /* } */
} // .end annotation
/* .line 1 */
/* new-instance v0, Ljava/text/SimpleDateFormat; */
final String v1 = "yyMMddHHmm"; // const-string v1, "yyMMddHHmm"
/* invoke-direct {v0, v1}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V */
(( fr.mbs.binary.Octets ) p0 ).toHexa ( ); // invoke-virtual {p0}, Lfr/mbs/binary/Octets;->toHexa()Ljava/lang/String;
(( java.text.SimpleDateFormat ) v0 ).parse ( p0 ); // invoke-virtual {v0, p0}, Ljava/text/SimpleDateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;
} // .end method
public static com.orange.oab.contactless.packid.domain.aztek.AztecApplicationData parse ( fr.mbs.binary.Octets p0 ) {
/* .locals 4 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lcom/orange/oab/contactless/packid/domain/InvalidApplicationDataException; */
/* } */
} // .end annotation
/* .line 1 */
/* new-instance v0, Lcom/orange/oab/contactless/packid/domain/aztek/AztecApplicationData; */
/* invoke-direct {v0}, Lcom/orange/oab/contactless/packid/domain/aztek/AztecApplicationData;-><init>()V */
/* .line 2 */
v1 = (( fr.mbs.binary.Octets ) p0 ).size ( ); // invoke-virtual {p0}, Lfr/mbs/binary/Octets;->size()I
/* const/16 v2, 0x50 */
/* if-lt v1, v2, :cond_0 */
/* const/16 v1, 0x20 */
int v2 = 2; // const/4 v2, 0x2
/* .line 3 */
(( fr.mbs.binary.Octets ) p0 ).get ( v1, v2 ); // invoke-virtual {p0, v1, v2}, Lfr/mbs/binary/Octets;->get(II)Lfr/mbs/binary/Octets;
(( fr.mbs.binary.Octets ) v1 ).reverse ( ); // invoke-virtual {v1}, Lfr/mbs/binary/Octets;->reverse()Lfr/mbs/binary/Octets;
v1 = (( fr.mbs.binary.Octets ) v1 ).toInt ( ); // invoke-virtual {v1}, Lfr/mbs/binary/Octets;->toInt()I
/* iput v1, v0, Lcom/orange/oab/contactless/packid/domain/aztek/AztecApplicationData;->b:I */
/* const/16 v1, 0x12 */
int v2 = 4; // const/4 v2, 0x4
/* .line 4 */
(( fr.mbs.binary.Octets ) p0 ).get ( v1, v2 ); // invoke-virtual {p0, v1, v2}, Lfr/mbs/binary/Octets;->get(II)Lfr/mbs/binary/Octets;
(( fr.mbs.binary.Octets ) v1 ).reverse ( ); // invoke-virtual {v1}, Lfr/mbs/binary/Octets;->reverse()Lfr/mbs/binary/Octets;
(( fr.mbs.binary.Octets ) v1 ).toHexa ( ); // invoke-virtual {v1}, Lfr/mbs/binary/Octets;->toHexa()Ljava/lang/String;
this.c = v1;
/* .line 5 */
try { // :try_start_0
fr.mbs.binary.Octets .empty ( );
/* const/16 v3, 0x18 */
(( fr.mbs.binary.Octets ) p0 ).get ( v3, v2 ); // invoke-virtual {p0, v3, v2}, Lfr/mbs/binary/Octets;->get(II)Lfr/mbs/binary/Octets;
(( fr.mbs.binary.Octets ) v1 ).put ( v2 ); // invoke-virtual {v1, v2}, Lfr/mbs/binary/Octets;->put(Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;
/* const/16 v2, 0x1d */
(( fr.mbs.binary.Octets ) p0 ).get ( v2 ); // invoke-virtual {p0, v2}, Lfr/mbs/binary/Octets;->get(I)Lg/a/a/a;
(( fr.mbs.binary.Octets ) v1 ).put ( v2 ); // invoke-virtual {v1, v2}, Lfr/mbs/binary/Octets;->put(Lg/a/a/a;)Lfr/mbs/binary/Octets;
/* .line 6 */
v2 = com.orange.oab.contactless.packid.domain.aztek.AztecApplicationData.MASK_FOR_YEAR_MONTH_DAY;
(( fr.mbs.binary.Octets ) v1 ).and ( v2 ); // invoke-virtual {v1, v2}, Lfr/mbs/binary/Octets;->and(Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;
com.orange.oab.contactless.packid.domain.aztek.AztecApplicationData .a ( v1 );
this.f = v1;
/* :try_end_0 */
/* .catch Ljava/text/ParseException; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
/* move-exception v1 */
final String v2 = "packid.AztecData"; // const-string v2, "packid.AztecData"
final String v3 = "Error while retrieving date"; // const-string v3, "Error while retrieving date"
/* .line 7 */
android.util.Log .d ( v2,v3,v1 );
} // :goto_0
/* const/16 v1, 0x3e */
int v2 = 1; // const/4 v2, 0x1
/* .line 8 */
(( fr.mbs.binary.Octets ) p0 ).get ( v1, v2 ); // invoke-virtual {p0, v1, v2}, Lfr/mbs/binary/Octets;->get(II)Lfr/mbs/binary/Octets;
(( fr.mbs.binary.Octets ) v1 ).toBytes ( ); // invoke-virtual {v1}, Lfr/mbs/binary/Octets;->toBytes()[B
int v3 = 0; // const/4 v3, 0x0
/* aget-byte v1, v1, v3 */
/* shr-int/lit8 v1, v1, 0x5 */
/* int-to-byte v1, v1 */
com.orange.oab.contactless.packid.domain.aztek.AztecApplicationData$TransactionType .a ( v1 );
this.d = v1;
/* const/16 v1, 0x26 */
/* .line 9 */
(( fr.mbs.binary.Octets ) p0 ).get ( v1, v2 ); // invoke-virtual {p0, v1, v2}, Lfr/mbs/binary/Octets;->get(II)Lfr/mbs/binary/Octets;
p0 = (( fr.mbs.binary.Octets ) p0 ).toShort ( ); // invoke-virtual {p0}, Lfr/mbs/binary/Octets;->toShort()S
/* iput-short p0, v0, Lcom/orange/oab/contactless/packid/domain/aztek/AztecApplicationData;->e:S */
/* .line 10 */
} // :cond_0
/* new-instance v0, Lcom/orange/oab/contactless/packid/domain/InvalidApplicationDataException; */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "Application data size expected to be 80 but is "; // const-string v2, "Application data size expected to be 80 but is "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
p0 = (( fr.mbs.binary.Octets ) p0 ).size ( ); // invoke-virtual {p0}, Lfr/mbs/binary/Octets;->size()I
(( java.lang.StringBuilder ) v1 ).append ( p0 ); // invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v0, p0}, Lcom/orange/oab/contactless/packid/domain/InvalidApplicationDataException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // .end method
/* # virtual methods */
public Integer calculateAmount ( com.orange.oab.contactless.packid.domain.aztek.AztecApplicationData p0 ) {
/* .locals 1 */
/* if-nez p1, :cond_0 */
int p1 = 0; // const/4 p1, 0x0
/* .line 1 */
} // :cond_0
p1 = (( com.orange.oab.contactless.packid.domain.aztek.AztecApplicationData ) p1 ).getCurrentBalance ( ); // invoke-virtual {p1}, Lcom/orange/oab/contactless/packid/domain/aztek/AztecApplicationData;->getCurrentBalance()I
/* .line 2 */
} // :goto_0
/* iget v0, p0, Lcom/orange/oab/contactless/packid/domain/aztek/AztecApplicationData;->b:I */
/* sub-int/2addr v0, p1 */
} // .end method
public Integer getCurrentBalance ( ) {
/* .locals 1 */
/* .line 1 */
/* iget v0, p0, Lcom/orange/oab/contactless/packid/domain/aztek/AztecApplicationData;->b:I */
} // .end method
public Object getFreeItem ( ) {
/* .locals 1 */
/* .line 1 */
/* iget-short v0, p0, Lcom/orange/oab/contactless/packid/domain/aztek/AztecApplicationData;->e:S */
} // .end method
public java.util.Date getLastDate ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.f;
} // .end method
public com.orange.oab.contactless.packid.domain.aztek.AztecApplicationData$TransactionType getLastTransactionType ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.d;
} // .end method
public java.lang.String getReaderNumber ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.c;
} // .end method
public void setCurrentBalance ( Object p0 ) {
/* .locals 0 */
/* .line 1 */
/* iput p1, p0, Lcom/orange/oab/contactless/packid/domain/aztek/AztecApplicationData;->b:I */
return;
} // .end method
public java.lang.String toString ( ) {
/* .locals 3 */
/* .line 1 */
e.f.b.a.j .a ( p0 );
/* iget v1, p0, Lcom/orange/oab/contactless/packid/domain/aztek/AztecApplicationData;->b:I */
final String v2 = "currentBalance"; // const-string v2, "currentBalance"
/* .line 2 */
(( e.f.b.a.j$a ) v0 ).a ( v2, v1 ); // invoke-virtual {v0, v2, v1}, Le/f/b/a/j$a;->a(Ljava/lang/String;I)Le/f/b/a/j$a;
v1 = this.c;
final String v2 = "readerNumber"; // const-string v2, "readerNumber"
/* .line 3 */
(( e.f.b.a.j$a ) v0 ).a ( v2, v1 ); // invoke-virtual {v0, v2, v1}, Le/f/b/a/j$a;->a(Ljava/lang/String;Ljava/lang/Object;)Le/f/b/a/j$a;
v1 = this.d;
final String v2 = "lastTransactionType"; // const-string v2, "lastTransactionType"
/* .line 4 */
(( e.f.b.a.j$a ) v0 ).a ( v2, v1 ); // invoke-virtual {v0, v2, v1}, Le/f/b/a/j$a;->a(Ljava/lang/String;Ljava/lang/Object;)Le/f/b/a/j$a;
v1 = this.f;
final String v2 = "lastDate"; // const-string v2, "lastDate"
/* .line 5 */
(( e.f.b.a.j$a ) v0 ).a ( v2, v1 ); // invoke-virtual {v0, v2, v1}, Le/f/b/a/j$a;->a(Ljava/lang/String;Ljava/lang/Object;)Le/f/b/a/j$a;
/* iget-short v1, p0, Lcom/orange/oab/contactless/packid/domain/aztek/AztecApplicationData;->e:S */
final String v2 = "freeItem"; // const-string v2, "freeItem"
/* .line 6 */
(( e.f.b.a.j$a ) v0 ).a ( v2, v1 ); // invoke-virtual {v0, v2, v1}, Le/f/b/a/j$a;->a(Ljava/lang/String;I)Le/f/b/a/j$a;
/* .line 7 */
(( e.f.b.a.j$a ) v0 ).toString ( ); // invoke-virtual {v0}, Le/f/b/a/j$a;->toString()Ljava/lang/String;
} // .end method
