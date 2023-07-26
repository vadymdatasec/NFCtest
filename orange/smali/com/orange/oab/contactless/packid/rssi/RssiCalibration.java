public class com.orange.oab.contactless.packid.rssi.RssiCalibration {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Lcom/orange/oab/contactless/packid/rssi/RssiCalibration$a; */
	 /* } */
} // .end annotation
/* # instance fields */
public final java.util.Map a;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/Map<", */
/* "Ljava/lang/String;", */
/* "Lm/a/a/a/b/b<", */
/* "Lcom/orange/oab/contactless/packid/rssi/RssiCalibration$a;", */
/* ">;>;" */
/* } */
} // .end annotation
} // .end field
public final Integer b;
public final Integer c;
/* # direct methods */
public com.orange.oab.contactless.packid.rssi.RssiCalibration ( ) {
/* .locals 1 */
/* .line 1 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 2 */
/* new-instance v0, Ljava/util/HashMap; */
/* invoke-direct {v0}, Ljava/util/HashMap;-><init>()V */
this.a = v0;
/* .line 3 */
/* iput p1, p0, Lcom/orange/oab/contactless/packid/rssi/RssiCalibration;->b:I */
/* .line 4 */
/* iput p2, p0, Lcom/orange/oab/contactless/packid/rssi/RssiCalibration;->c:I */
return;
} // .end method
/* # virtual methods */
public final java.lang.Byte a ( Object p0 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Lm/a/a/a/b/b<", */
/* "Lcom/orange/oab/contactless/packid/rssi/RssiCalibration$a;", */
/* ">;)", */
/* "Ljava/lang/Byte;" */
/* } */
} // .end annotation
/* .line 12 */
v0 = (( m.a.a.a.b.b ) p1 ).size ( ); // invoke-virtual {p1}, Lm/a/a/a/b/b;->size()I
/* if-lez v0, :cond_0 */
/* add-int/lit8 v0, v0, -0x1 */
/* .line 13 */
(( m.a.a.a.b.b ) p1 ).get ( v0 ); // invoke-virtual {p1, v0}, Lm/a/a/a/b/b;->get(I)Ljava/lang/Object;
/* check-cast p1, Lcom/orange/oab/contactless/packid/rssi/RssiCalibration$a; */
/* iget-byte p1, p1, Lcom/orange/oab/contactless/packid/rssi/RssiCalibration$a;->a:B */
java.lang.Byte .valueOf ( p1 );
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
} // :goto_0
} // .end method
public final java.lang.String a ( fr.mbs.binary.Octets p0, fr.mbs.binary.Octets p1, java.lang.String p2 ) {
/* .locals 1 */
/* .line 1 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
(( fr.mbs.binary.Octets ) p1 ).toHexa ( ); // invoke-virtual {p1}, Lfr/mbs/binary/Octets;->toHexa()Ljava/lang/String;
(( java.lang.StringBuilder ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( fr.mbs.binary.Octets ) p2 ).toHexa ( ); // invoke-virtual {p2}, Lfr/mbs/binary/Octets;->toHexa()Ljava/lang/String;
(( java.lang.StringBuilder ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).append ( p3 ); // invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // .end method
public final java.lang.String a ( java.lang.String p0, java.lang.Object p1 ) {
/* .locals 1 */
/* .line 11 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
(( java.lang.StringBuilder ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String p1 = ":"; // const-string p1, ":"
(( java.lang.StringBuilder ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).append ( p2 ); // invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // .end method
public final java.util.Date a ( com.orange.oab.contactless.packid.rssi.RssiCalibration$a p0 ) {
/* .locals 2 */
/* .line 7 */
java.util.Calendar .getInstance ( );
/* .line 8 */
p1 = this.b;
(( java.util.Calendar ) v0 ).setTime ( p1 ); // invoke-virtual {v0, p1}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V
/* .line 9 */
/* iget p1, p0, Lcom/orange/oab/contactless/packid/rssi/RssiCalibration;->c:I */
/* const/16 v1, 0xd */
(( java.util.Calendar ) v0 ).add ( v1, p1 ); // invoke-virtual {v0, v1, p1}, Ljava/util/Calendar;->add(II)V
/* .line 10 */
(( java.util.Calendar ) v0 ).getTime ( ); // invoke-virtual {v0}, Ljava/util/Calendar;->getTime()Ljava/util/Date;
} // .end method
public void a ( ) {
/* .locals 6 */
/* .line 2 */
e.h.d.a.a.n.t .b ( );
/* .line 3 */
v1 = this.a;
v2 = } // :cond_0
if ( v2 != null) { // if-eqz v2, :cond_2
/* check-cast v2, Lm/a/a/a/b/b; */
/* .line 4 */
(( m.a.a.a.b.b ) v2 ).iterator ( ); // invoke-virtual {v2}, Lm/a/a/a/b/b;->iterator()Ljava/util/Iterator;
} // :cond_1
v4 = } // :goto_0
if ( v4 != null) { // if-eqz v4, :cond_0
/* check-cast v4, Lcom/orange/oab/contactless/packid/rssi/RssiCalibration$a; */
/* .line 5 */
(( com.orange.oab.contactless.packid.rssi.RssiCalibration ) p0 ).a ( v4 ); // invoke-virtual {p0, v4}, Lcom/orange/oab/contactless/packid/rssi/RssiCalibration;->a(Lcom/orange/oab/contactless/packid/rssi/RssiCalibration$a;)Ljava/util/Date;
v5 = (( java.util.Date ) v0 ).compareTo ( v5 ); // invoke-virtual {v0, v5}, Ljava/util/Date;->compareTo(Ljava/util/Date;)I
/* if-lez v5, :cond_1 */
/* .line 6 */
(( java.util.AbstractCollection ) v2 ).remove ( v4 ); // invoke-virtual {v2, v4}, Ljava/util/AbstractCollection;->remove(Ljava/lang/Object;)Z
} // :cond_2
return;
} // .end method
public void addValue ( fr.mbs.binary.Octets p0, fr.mbs.binary.Octets p1, java.lang.String p2, Object p3 ) {
/* .locals 2 */
/* .line 1 */
(( com.orange.oab.contactless.packid.rssi.RssiCalibration ) p0 ).c ( p1, p2, p3 ); // invoke-virtual {p0, p1, p2, p3}, Lcom/orange/oab/contactless/packid/rssi/RssiCalibration;->c(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;Ljava/lang/String;)Lm/a/a/a/b/b;
/* if-nez v0, :cond_0 */
/* .line 2 */
/* new-instance v0, Lm/a/a/a/b/b; */
/* iget v1, p0, Lcom/orange/oab/contactless/packid/rssi/RssiCalibration;->b:I */
/* invoke-direct {v0, v1}, Lm/a/a/a/b/b;-><init>(I)V */
/* .line 3 */
} // :cond_0
/* new-instance v1, Lcom/orange/oab/contactless/packid/rssi/RssiCalibration$a; */
/* invoke-direct {v1, p4}, Lcom/orange/oab/contactless/packid/rssi/RssiCalibration$a;-><init>(B)V */
(( m.a.a.a.b.b ) v0 ).add ( v1 ); // invoke-virtual {v0, v1}, Lm/a/a/a/b/b;->add(Ljava/lang/Object;)Z
/* .line 4 */
p4 = this.a;
(( com.orange.oab.contactless.packid.rssi.RssiCalibration ) p0 ).a ( p1, p2, p3 ); // invoke-virtual {p0, p1, p2, p3}, Lcom/orange/oab/contactless/packid/rssi/RssiCalibration;->a(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;Ljava/lang/String;)Ljava/lang/String;
return;
} // .end method
public java.lang.Byte average ( fr.mbs.binary.Octets p0, fr.mbs.binary.Octets p1, java.lang.String p2 ) {
/* .locals 1 */
/* .line 1 */
(( com.orange.oab.contactless.packid.rssi.RssiCalibration ) p0 ).c ( p1, p2, p3 ); // invoke-virtual {p0, p1, p2, p3}, Lcom/orange/oab/contactless/packid/rssi/RssiCalibration;->c(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;Ljava/lang/String;)Lm/a/a/a/b/b;
/* if-nez p1, :cond_0 */
int p1 = 0; // const/4 p1, 0x0
/* .line 2 */
} // :cond_0
(( m.a.a.a.b.b ) p1 ).iterator ( ); // invoke-virtual {p1}, Lm/a/a/a/b/b;->iterator()Ljava/util/Iterator;
int p3 = 0; // const/4 p3, 0x0
v0 = } // :goto_0
if ( v0 != null) { // if-eqz v0, :cond_1
/* check-cast v0, Lcom/orange/oab/contactless/packid/rssi/RssiCalibration$a; */
/* .line 3 */
/* iget-byte v0, v0, Lcom/orange/oab/contactless/packid/rssi/RssiCalibration$a;->a:B */
/* add-int/2addr p3, v0 */
/* .line 4 */
} // :cond_1
p1 = (( m.a.a.a.b.b ) p1 ).size ( ); // invoke-virtual {p1}, Lm/a/a/a/b/b;->size()I
/* div-int/2addr p3, p1 */
/* int-to-byte p1, p3 */
java.lang.Byte .valueOf ( p1 );
} // .end method
public final java.lang.Byte b ( fr.mbs.binary.Octets p0, fr.mbs.binary.Octets p1, java.lang.String p2 ) {
/* .locals 0 */
/* .line 2 */
(( com.orange.oab.contactless.packid.rssi.RssiCalibration ) p0 ).c ( p1, p2, p3 ); // invoke-virtual {p0, p1, p2, p3}, Lcom/orange/oab/contactless/packid/rssi/RssiCalibration;->c(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;Ljava/lang/String;)Lm/a/a/a/b/b;
/* if-nez p1, :cond_0 */
int p1 = 0; // const/4 p1, 0x0
/* .line 3 */
} // :cond_0
(( com.orange.oab.contactless.packid.rssi.RssiCalibration ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Lcom/orange/oab/contactless/packid/rssi/RssiCalibration;->a(Lm/a/a/a/b/b;)Ljava/lang/Byte;
} // :goto_0
} // .end method
public final java.lang.String b ( java.lang.String p0, java.lang.Object p1 ) {
/* .locals 1 */
/* .line 1 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
(( com.orange.oab.contactless.packid.rssi.RssiCalibration ) p0 ).a ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Lcom/orange/oab/contactless/packid/rssi/RssiCalibration;->a(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;
(( java.lang.StringBuilder ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String p1 = ", "; // const-string p1, ", "
(( java.lang.StringBuilder ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // .end method
public final m.a.a.a.b.b c ( fr.mbs.binary.Octets p0, fr.mbs.binary.Octets p1, java.lang.String p2 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Lfr/mbs/binary/Octets;", */
/* "Lfr/mbs/binary/Octets;", */
/* "Ljava/lang/String;", */
/* ")", */
/* "Lm/a/a/a/b/b<", */
/* "Lcom/orange/oab/contactless/packid/rssi/RssiCalibration$a;", */
/* ">;" */
/* } */
} // .end annotation
/* .line 1 */
v0 = this.a;
(( com.orange.oab.contactless.packid.rssi.RssiCalibration ) p0 ).a ( p1, p2, p3 ); // invoke-virtual {p0, p1, p2, p3}, Lcom/orange/oab/contactless/packid/rssi/RssiCalibration;->a(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;Ljava/lang/String;)Ljava/lang/String;
/* check-cast p1, Lm/a/a/a/b/b; */
} // .end method
public Integer count ( fr.mbs.binary.Octets p0, fr.mbs.binary.Octets p1, java.lang.String p2 ) {
/* .locals 0 */
/* .line 1 */
(( com.orange.oab.contactless.packid.rssi.RssiCalibration ) p0 ).a ( ); // invoke-virtual {p0}, Lcom/orange/oab/contactless/packid/rssi/RssiCalibration;->a()V
/* .line 2 */
(( com.orange.oab.contactless.packid.rssi.RssiCalibration ) p0 ).c ( p1, p2, p3 ); // invoke-virtual {p0, p1, p2, p3}, Lcom/orange/oab/contactless/packid/rssi/RssiCalibration;->c(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;Ljava/lang/String;)Lm/a/a/a/b/b;
/* if-nez p1, :cond_0 */
int p1 = 0; // const/4 p1, 0x0
/* .line 3 */
} // :cond_0
p1 = (( m.a.a.a.b.b ) p1 ).size ( ); // invoke-virtual {p1}, Lm/a/a/a/b/b;->size()I
} // :goto_0
} // .end method
public Boolean isCalibrationCompleted ( fr.mbs.binary.Octets p0, fr.mbs.binary.Octets p1, java.lang.String p2 ) {
/* .locals 0 */
/* .line 1 */
(( com.orange.oab.contactless.packid.rssi.RssiCalibration ) p0 ).c ( p1, p2, p3 ); // invoke-virtual {p0, p1, p2, p3}, Lcom/orange/oab/contactless/packid/rssi/RssiCalibration;->c(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;Ljava/lang/String;)Lm/a/a/a/b/b;
int p2 = 0; // const/4 p2, 0x0
/* if-nez p1, :cond_0 */
/* .line 2 */
} // :cond_0
p1 = (( m.a.a.a.b.b ) p1 ).size ( ); // invoke-virtual {p1}, Lm/a/a/a/b/b;->size()I
/* iget p3, p0, Lcom/orange/oab/contactless/packid/rssi/RssiCalibration;->b:I */
/* if-ne p1, p3, :cond_1 */
int p2 = 1; // const/4 p2, 0x1
} // :cond_1
} // .end method
public java.lang.Byte max ( fr.mbs.binary.Octets p0, fr.mbs.binary.Octets p1, java.lang.String p2 ) {
/* .locals 2 */
/* .line 1 */
(( com.orange.oab.contactless.packid.rssi.RssiCalibration ) p0 ).c ( p1, p2, p3 ); // invoke-virtual {p0, p1, p2, p3}, Lcom/orange/oab/contactless/packid/rssi/RssiCalibration;->c(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;Ljava/lang/String;)Lm/a/a/a/b/b;
int p2 = 0; // const/4 p2, 0x0
/* if-nez p1, :cond_0 */
/* .line 2 */
} // :cond_0
(( m.a.a.a.b.b ) p1 ).iterator ( ); // invoke-virtual {p1}, Lm/a/a/a/b/b;->iterator()Ljava/util/Iterator;
} // :cond_1
p3 = } // :goto_0
if ( p3 != null) { // if-eqz p3, :cond_3
/* check-cast p3, Lcom/orange/oab/contactless/packid/rssi/RssiCalibration$a; */
if ( p2 != null) { // if-eqz p2, :cond_2
/* .line 3 */
/* iget-byte v0, p3, Lcom/orange/oab/contactless/packid/rssi/RssiCalibration$a;->a:B */
v1 = (( java.lang.Byte ) p2 ).byteValue ( ); // invoke-virtual {p2}, Ljava/lang/Byte;->byteValue()B
/* if-le v0, v1, :cond_1 */
} // :cond_2
/* iget-byte p2, p3, Lcom/orange/oab/contactless/packid/rssi/RssiCalibration$a;->a:B */
java.lang.Byte .valueOf ( p2 );
} // :cond_3
} // .end method
public java.lang.Byte min ( fr.mbs.binary.Octets p0, fr.mbs.binary.Octets p1, java.lang.String p2 ) {
/* .locals 2 */
/* .line 1 */
(( com.orange.oab.contactless.packid.rssi.RssiCalibration ) p0 ).c ( p1, p2, p3 ); // invoke-virtual {p0, p1, p2, p3}, Lcom/orange/oab/contactless/packid/rssi/RssiCalibration;->c(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;Ljava/lang/String;)Lm/a/a/a/b/b;
int p2 = 0; // const/4 p2, 0x0
/* if-nez p1, :cond_0 */
/* .line 2 */
} // :cond_0
(( m.a.a.a.b.b ) p1 ).iterator ( ); // invoke-virtual {p1}, Lm/a/a/a/b/b;->iterator()Ljava/util/Iterator;
} // :cond_1
p3 = } // :goto_0
if ( p3 != null) { // if-eqz p3, :cond_3
/* check-cast p3, Lcom/orange/oab/contactless/packid/rssi/RssiCalibration$a; */
if ( p2 != null) { // if-eqz p2, :cond_2
/* .line 3 */
/* iget-byte v0, p3, Lcom/orange/oab/contactless/packid/rssi/RssiCalibration$a;->a:B */
v1 = (( java.lang.Byte ) p2 ).byteValue ( ); // invoke-virtual {p2}, Ljava/lang/Byte;->byteValue()B
/* if-ge v0, v1, :cond_1 */
} // :cond_2
/* iget-byte p2, p3, Lcom/orange/oab/contactless/packid/rssi/RssiCalibration$a;->a:B */
java.lang.Byte .valueOf ( p2 );
} // :cond_3
} // .end method
public void reset ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.a;
return;
} // .end method
public void reset ( fr.mbs.binary.Octets p0, fr.mbs.binary.Octets p1, java.lang.String p2 ) {
/* .locals 1 */
/* .line 2 */
v0 = this.a;
(( com.orange.oab.contactless.packid.rssi.RssiCalibration ) p0 ).a ( p1, p2, p3 ); // invoke-virtual {p0, p1, p2, p3}, Lcom/orange/oab/contactless/packid/rssi/RssiCalibration;->a(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;Ljava/lang/String;)Ljava/lang/String;
return;
} // .end method
public java.lang.Double rssiPerSec ( fr.mbs.binary.Octets p0, fr.mbs.binary.Octets p1, java.lang.String p2 ) {
/* .locals 4 */
/* .line 1 */
(( com.orange.oab.contactless.packid.rssi.RssiCalibration ) p0 ).c ( p1, p2, p3 ); // invoke-virtual {p0, p1, p2, p3}, Lcom/orange/oab/contactless/packid/rssi/RssiCalibration;->c(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;Ljava/lang/String;)Lm/a/a/a/b/b;
/* if-nez p1, :cond_0 */
int p1 = 0; // const/4 p1, 0x0
} // :cond_0
int p2 = 0; // const/4 p2, 0x0
/* .line 2 */
(( m.a.a.a.b.b ) p1 ).get ( p2 ); // invoke-virtual {p1, p2}, Lm/a/a/a/b/b;->get(I)Ljava/lang/Object;
/* check-cast p2, Lcom/orange/oab/contactless/packid/rssi/RssiCalibration$a; */
/* .line 3 */
p3 = (( m.a.a.a.b.b ) p1 ).size ( ); // invoke-virtual {p1}, Lm/a/a/a/b/b;->size()I
/* add-int/lit8 p3, p3, -0x1 */
(( m.a.a.a.b.b ) p1 ).get ( p3 ); // invoke-virtual {p1, p3}, Lm/a/a/a/b/b;->get(I)Ljava/lang/Object;
/* check-cast p3, Lcom/orange/oab/contactless/packid/rssi/RssiCalibration$a; */
/* .line 4 */
p1 = (( m.a.a.a.b.b ) p1 ).size ( ); // invoke-virtual {p1}, Lm/a/a/a/b/b;->size()I
/* int-to-double v0, p1 */
/* const-wide v2, 0x408f400000000000L # 1000.0 */
/* mul-double v0, v0, v2 */
p1 = this.b;
(( java.util.Date ) p1 ).getTime ( ); // invoke-virtual {p1}, Ljava/util/Date;->getTime()J
/* move-result-wide v2 */
p1 = this.b;
(( java.util.Date ) p1 ).getTime ( ); // invoke-virtual {p1}, Ljava/util/Date;->getTime()J
/* move-result-wide p1 */
/* sub-long/2addr v2, p1 */
/* long-to-double p1, v2 */
/* div-double/2addr v0, p1 */
/* const-wide/high16 p1, 0x4059000000000000L # 100.0 */
/* mul-double v0, v0, p1 */
java.lang.Math .floor ( v0,v1 );
/* move-result-wide v0 */
/* div-double/2addr v0, p1 */
java.lang.Double .valueOf ( v0,v1 );
} // .end method
public java.lang.String rssiResults ( fr.mbs.binary.Octets p0, fr.mbs.binary.Octets p1, java.lang.String p2 ) {
/* .locals 4 */
/* .line 1 */
v0 = (( com.orange.oab.contactless.packid.rssi.RssiCalibration ) p0 ).count ( p1, p2, p3 ); // invoke-virtual {p0, p1, p2, p3}, Lcom/orange/oab/contactless/packid/rssi/RssiCalibration;->count(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;Ljava/lang/String;)I
/* if-lez v0, :cond_0 */
/* .line 2 */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
/* .line 3 */
(( com.orange.oab.contactless.packid.rssi.RssiCalibration ) p0 ).b ( p1, p2, p3 ); // invoke-virtual {p0, p1, p2, p3}, Lcom/orange/oab/contactless/packid/rssi/RssiCalibration;->b(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;Ljava/lang/String;)Ljava/lang/Byte;
final String v3 = "last"; // const-string v3, "last"
(( com.orange.oab.contactless.packid.rssi.RssiCalibration ) p0 ).b ( v3, v2 ); // invoke-virtual {p0, v3, v2}, Lcom/orange/oab/contactless/packid/rssi/RssiCalibration;->b(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 4 */
(( com.orange.oab.contactless.packid.rssi.RssiCalibration ) p0 ).min ( p1, p2, p3 ); // invoke-virtual {p0, p1, p2, p3}, Lcom/orange/oab/contactless/packid/rssi/RssiCalibration;->min(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;Ljava/lang/String;)Ljava/lang/Byte;
final String v3 = "min"; // const-string v3, "min"
(( com.orange.oab.contactless.packid.rssi.RssiCalibration ) p0 ).b ( v3, v2 ); // invoke-virtual {p0, v3, v2}, Lcom/orange/oab/contactless/packid/rssi/RssiCalibration;->b(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 5 */
(( com.orange.oab.contactless.packid.rssi.RssiCalibration ) p0 ).average ( p1, p2, p3 ); // invoke-virtual {p0, p1, p2, p3}, Lcom/orange/oab/contactless/packid/rssi/RssiCalibration;->average(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;Ljava/lang/String;)Ljava/lang/Byte;
final String v3 = "avg"; // const-string v3, "avg"
(( com.orange.oab.contactless.packid.rssi.RssiCalibration ) p0 ).b ( v3, v2 ); // invoke-virtual {p0, v3, v2}, Lcom/orange/oab/contactless/packid/rssi/RssiCalibration;->b(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 6 */
(( com.orange.oab.contactless.packid.rssi.RssiCalibration ) p0 ).max ( p1, p2, p3 ); // invoke-virtual {p0, p1, p2, p3}, Lcom/orange/oab/contactless/packid/rssi/RssiCalibration;->max(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;Ljava/lang/String;)Ljava/lang/Byte;
final String v3 = "max"; // const-string v3, "max"
(( com.orange.oab.contactless.packid.rssi.RssiCalibration ) p0 ).b ( v3, v2 ); // invoke-virtual {p0, v3, v2}, Lcom/orange/oab/contactless/packid/rssi/RssiCalibration;->b(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 7 */
java.lang.Integer .valueOf ( v0 );
final String v2 = "nb"; // const-string v2, "nb"
(( com.orange.oab.contactless.packid.rssi.RssiCalibration ) p0 ).b ( v2, v0 ); // invoke-virtual {p0, v2, v0}, Lcom/orange/oab/contactless/packid/rssi/RssiCalibration;->b(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;
(( java.lang.StringBuilder ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 8 */
(( com.orange.oab.contactless.packid.rssi.RssiCalibration ) p0 ).rssiPerSec ( p1, p2, p3 ); // invoke-virtual {p0, p1, p2, p3}, Lcom/orange/oab/contactless/packid/rssi/RssiCalibration;->rssiPerSec(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;Ljava/lang/String;)Ljava/lang/Double;
final String p2 = "nb/s"; // const-string p2, "nb/s"
(( com.orange.oab.contactless.packid.rssi.RssiCalibration ) p0 ).a ( p2, p1 ); // invoke-virtual {p0, p2, p1}, Lcom/orange/oab/contactless/packid/rssi/RssiCalibration;->a(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;
(( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
} // :goto_0
} // .end method
