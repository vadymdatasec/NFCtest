public abstract class com.google.android.gms.common.internal.safeparcel.SafeParcelReader {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Lcom/google/android/gms/common/internal/safeparcel/SafeParcelReader$ParseException; */
	 /* } */
} // .end annotation
/* # direct methods */
public static Integer a ( Integer p0 ) {
	 /* .locals 1 */
	 /* const v0, 0xffff */
	 /* and-int/2addr p0, v0 */
} // .end method
public static Integer a ( android.os.Parcel p0 ) {
	 /* .locals 0 */
	 /* .line 1 */
	 p0 = 	 (( android.os.Parcel ) p0 ).readInt ( ); // invoke-virtual {p0}, Landroid/os/Parcel;->readInt()I
} // .end method
public static android.os.Bundle a ( android.os.Parcel p0, Integer p1 ) {
	 /* .locals 2 */
	 /* .line 9 */
	 p1 = 	 com.google.android.gms.common.internal.safeparcel.SafeParcelReader .i ( p0,p1 );
	 /* .line 10 */
	 v0 = 	 (( android.os.Parcel ) p0 ).dataPosition ( ); // invoke-virtual {p0}, Landroid/os/Parcel;->dataPosition()I
	 /* if-nez p1, :cond_0 */
	 int p0 = 0; // const/4 p0, 0x0
	 /* .line 11 */
} // :cond_0
(( android.os.Parcel ) p0 ).readBundle ( ); // invoke-virtual {p0}, Landroid/os/Parcel;->readBundle()Landroid/os/Bundle;
/* add-int/2addr v0, p1 */
/* .line 12 */
(( android.os.Parcel ) p0 ).setDataPosition ( v0 ); // invoke-virtual {p0, v0}, Landroid/os/Parcel;->setDataPosition(I)V
} // .end method
public static android.os.Parcelable a ( android.os.Parcel p0, Integer p1, android.os.Parcelable$Creator p2 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "<T::", */
/* "Landroid/os/Parcelable;", */
/* ">(", */
/* "Landroid/os/Parcel;", */
/* "I", */
/* "Landroid/os/Parcelable$Creator<", */
/* "TT;>;)TT;" */
/* } */
} // .end annotation
/* .line 5 */
p1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader .i ( p0,p1 );
/* .line 6 */
v0 = (( android.os.Parcel ) p0 ).dataPosition ( ); // invoke-virtual {p0}, Landroid/os/Parcel;->dataPosition()I
/* if-nez p1, :cond_0 */
int p0 = 0; // const/4 p0, 0x0
/* .line 7 */
} // :cond_0
/* check-cast p2, Landroid/os/Parcelable; */
/* add-int/2addr v0, p1 */
/* .line 8 */
(( android.os.Parcel ) p0 ).setDataPosition ( v0 ); // invoke-virtual {p0, v0}, Landroid/os/Parcel;->setDataPosition(I)V
} // .end method
public static void a ( android.os.Parcel p0, Integer p1, Integer p2 ) {
/* .locals 4 */
/* .line 2 */
p1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader .i ( p0,p1 );
/* if-ne p1, p2, :cond_0 */
return;
/* .line 3 */
} // :cond_0
/* new-instance v0, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelReader$ParseException; */
/* .line 4 */
java.lang.Integer .toHexString ( p1 );
java.lang.String .valueOf ( v1 );
v2 = (( java.lang.String ) v2 ).length ( ); // invoke-virtual {v2}, Ljava/lang/String;->length()I
/* add-int/lit8 v2, v2, 0x2e */
/* new-instance v3, Ljava/lang/StringBuilder; */
/* invoke-direct {v3, v2}, Ljava/lang/StringBuilder;-><init>(I)V */
final String v2 = "Expected size "; // const-string v2, "Expected size "
(( java.lang.StringBuilder ) v3 ).append ( v2 ); // invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).append ( p2 ); // invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String p2 = " got "; // const-string p2, " got "
(( java.lang.StringBuilder ) v3 ).append ( p2 ); // invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).append ( p1 ); // invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String p1 = " (0x"; // const-string p1, " (0x"
(( java.lang.StringBuilder ) v3 ).append ( p1 ); // invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).append ( v1 ); // invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String p1 = ")"; // const-string p1, ")"
(( java.lang.StringBuilder ) v3 ).append ( p1 ); // invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v0, p1, p0}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelReader$ParseException;-><init>(Ljava/lang/String;Landroid/os/Parcel;)V */
/* throw v0 */
} // .end method
public static Integer b ( android.os.Parcel p0 ) {
/* .locals 5 */
/* .line 1 */
v0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader .a ( p0 );
/* .line 2 */
v1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader .i ( p0,v0 );
/* .line 3 */
v2 = (( android.os.Parcel ) p0 ).dataPosition ( ); // invoke-virtual {p0}, Landroid/os/Parcel;->dataPosition()I
/* .line 4 */
v3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader .a ( v0 );
/* const/16 v4, 0x4f45 */
/* if-eq v3, v4, :cond_1 */
/* .line 5 */
/* new-instance v1, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelReader$ParseException; */
final String v2 = "Expected object header.Got 0x"; // const-string v2, "Expected object header.Got 0x"
java.lang.Integer .toHexString ( v0 );
java.lang.String .valueOf ( v0 );
v3 = (( java.lang.String ) v0 ).length ( ); // invoke-virtual {v0}, Ljava/lang/String;->length()I
if ( v3 != null) { // if-eqz v3, :cond_0
(( java.lang.String ) v2 ).concat ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;
} // :cond_0
/* new-instance v0, Ljava/lang/String; */
/* invoke-direct {v0, v2}, Ljava/lang/String;-><init>(Ljava/lang/String;)V */
} // :goto_0
/* invoke-direct {v1, v0, p0}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelReader$ParseException;-><init>(Ljava/lang/String;Landroid/os/Parcel;)V */
/* throw v1 */
} // :cond_1
/* add-int/2addr v1, v2 */
/* if-lt v1, v2, :cond_2 */
/* .line 6 */
v0 = (( android.os.Parcel ) p0 ).dataSize ( ); // invoke-virtual {p0}, Landroid/os/Parcel;->dataSize()I
/* if-gt v1, v0, :cond_2 */
/* .line 7 */
} // :cond_2
/* new-instance v0, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelReader$ParseException; */
/* const/16 v3, 0x36 */
/* new-instance v4, Ljava/lang/StringBuilder; */
/* invoke-direct {v4, v3}, Ljava/lang/StringBuilder;-><init>(I)V */
final String v3 = "Size read is invalid start="; // const-string v3, "Size read is invalid start="
(( java.lang.StringBuilder ) v4 ).append ( v3 ); // invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v4 ).append ( v2 ); // invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v2 = " end="; // const-string v2, " end="
(( java.lang.StringBuilder ) v4 ).append ( v2 ); // invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v4 ).append ( v1 ); // invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v4 ).toString ( ); // invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v0, v1, p0}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelReader$ParseException;-><init>(Ljava/lang/String;Landroid/os/Parcel;)V */
/* throw v0 */
} // .end method
public static java.lang.String b ( android.os.Parcel p0, Integer p1 ) {
/* .locals 2 */
/* .line 8 */
p1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader .i ( p0,p1 );
/* .line 9 */
v0 = (( android.os.Parcel ) p0 ).dataPosition ( ); // invoke-virtual {p0}, Landroid/os/Parcel;->dataPosition()I
/* if-nez p1, :cond_0 */
int p0 = 0; // const/4 p0, 0x0
/* .line 10 */
} // :cond_0
(( android.os.Parcel ) p0 ).readString ( ); // invoke-virtual {p0}, Landroid/os/Parcel;->readString()Ljava/lang/String;
/* add-int/2addr v0, p1 */
/* .line 11 */
(( android.os.Parcel ) p0 ).setDataPosition ( v0 ); // invoke-virtual {p0, v0}, Landroid/os/Parcel;->setDataPosition(I)V
} // .end method
public static java.util.ArrayList c ( android.os.Parcel p0, Integer p1 ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Landroid/os/Parcel;", */
/* "I)", */
/* "Ljava/util/ArrayList<", */
/* "Ljava/lang/String;", */
/* ">;" */
/* } */
} // .end annotation
/* .line 1 */
p1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader .i ( p0,p1 );
/* .line 2 */
v0 = (( android.os.Parcel ) p0 ).dataPosition ( ); // invoke-virtual {p0}, Landroid/os/Parcel;->dataPosition()I
/* if-nez p1, :cond_0 */
int p0 = 0; // const/4 p0, 0x0
/* .line 3 */
} // :cond_0
(( android.os.Parcel ) p0 ).createStringArrayList ( ); // invoke-virtual {p0}, Landroid/os/Parcel;->createStringArrayList()Ljava/util/ArrayList;
/* add-int/2addr v0, p1 */
/* .line 4 */
(( android.os.Parcel ) p0 ).setDataPosition ( v0 ); // invoke-virtual {p0, v0}, Landroid/os/Parcel;->setDataPosition(I)V
} // .end method
public static void d ( android.os.Parcel p0, Integer p1 ) {
/* .locals 3 */
/* .line 1 */
v0 = (( android.os.Parcel ) p0 ).dataPosition ( ); // invoke-virtual {p0}, Landroid/os/Parcel;->dataPosition()I
/* if-ne v0, p1, :cond_0 */
return;
/* .line 2 */
} // :cond_0
/* new-instance v0, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelReader$ParseException; */
/* const/16 v1, 0x25 */
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(I)V */
final String v1 = "Overread allowed size end="; // const-string v1, "Overread allowed size end="
(( java.lang.StringBuilder ) v2 ).append ( v1 ); // invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).append ( p1 ); // invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v0, p1, p0}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelReader$ParseException;-><init>(Ljava/lang/String;Landroid/os/Parcel;)V */
/* throw v0 */
} // .end method
public static Boolean e ( android.os.Parcel p0, Integer p1 ) {
/* .locals 1 */
int v0 = 4; // const/4 v0, 0x4
/* .line 1 */
com.google.android.gms.common.internal.safeparcel.SafeParcelReader .a ( p0,p1,v0 );
/* .line 2 */
p0 = (( android.os.Parcel ) p0 ).readInt ( ); // invoke-virtual {p0}, Landroid/os/Parcel;->readInt()I
if ( p0 != null) { // if-eqz p0, :cond_0
int p0 = 1; // const/4 p0, 0x1
} // :cond_0
int p0 = 0; // const/4 p0, 0x0
} // .end method
public static Float f ( android.os.Parcel p0, Integer p1 ) {
/* .locals 1 */
int v0 = 4; // const/4 v0, 0x4
/* .line 1 */
com.google.android.gms.common.internal.safeparcel.SafeParcelReader .a ( p0,p1,v0 );
/* .line 2 */
p0 = (( android.os.Parcel ) p0 ).readFloat ( ); // invoke-virtual {p0}, Landroid/os/Parcel;->readFloat()F
} // .end method
public static Integer g ( android.os.Parcel p0, Integer p1 ) {
/* .locals 1 */
int v0 = 4; // const/4 v0, 0x4
/* .line 1 */
com.google.android.gms.common.internal.safeparcel.SafeParcelReader .a ( p0,p1,v0 );
/* .line 2 */
p0 = (( android.os.Parcel ) p0 ).readInt ( ); // invoke-virtual {p0}, Landroid/os/Parcel;->readInt()I
} // .end method
public static Long h ( android.os.Parcel p0, Integer p1 ) {
/* .locals 1 */
/* const/16 v0, 0x8 */
/* .line 1 */
com.google.android.gms.common.internal.safeparcel.SafeParcelReader .a ( p0,p1,v0 );
/* .line 2 */
(( android.os.Parcel ) p0 ).readLong ( ); // invoke-virtual {p0}, Landroid/os/Parcel;->readLong()J
/* move-result-wide p0 */
/* return-wide p0 */
} // .end method
public static Integer i ( android.os.Parcel p0, Integer p1 ) {
/* .locals 2 */
/* const/high16 v0, -0x10000 */
/* and-int v1, p1, v0 */
/* if-eq v1, v0, :cond_0 */
/* shr-int/lit8 p0, p1, 0x10 */
/* const p1, 0xffff */
/* and-int/2addr p0, p1 */
/* .line 1 */
} // :cond_0
p0 = (( android.os.Parcel ) p0 ).readInt ( ); // invoke-virtual {p0}, Landroid/os/Parcel;->readInt()I
} // .end method
public static void j ( android.os.Parcel p0, Integer p1 ) {
/* .locals 1 */
/* .line 1 */
p1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader .i ( p0,p1 );
/* .line 2 */
v0 = (( android.os.Parcel ) p0 ).dataPosition ( ); // invoke-virtual {p0}, Landroid/os/Parcel;->dataPosition()I
/* add-int/2addr v0, p1 */
(( android.os.Parcel ) p0 ).setDataPosition ( v0 ); // invoke-virtual {p0, v0}, Landroid/os/Parcel;->setDataPosition(I)V
return;
} // .end method
