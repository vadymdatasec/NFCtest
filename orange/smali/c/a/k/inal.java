public class inal implements android.os.Parcelable {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation build Landroid/annotation/SuppressLint; */
	 /* value = { */
	 /* "BanParcelableUsage" */
	 /* } */
} // .end annotation
/* # static fields */
public static final android.os.Parcelable$Creator CREATOR;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Landroid/os/Parcelable$Creator<", */
/* "Lc/a/k/b;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
/* # instance fields */
public final Integer b;
public final android.content.Intent c;
/* # direct methods */
public static inal ( ) {
/* .locals 1 */
/* .line 1 */
/* new-instance v0, Lc/a/k/a; */
/* invoke-direct {v0}, Lc/a/k/a;-><init>()V */
return;
} // .end method
public inal ( ) {
/* .locals 0 */
/* .line 1 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 2 */
/* iput p1, p0, Lc/a/k/b;->b:I */
/* .line 3 */
this.c = p2;
return;
} // .end method
public inal ( ) {
/* .locals 1 */
/* .line 4 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 5 */
v0 = (( android.os.Parcel ) p1 ).readInt ( ); // invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I
/* iput v0, p0, Lc/a/k/b;->b:I */
/* .line 6 */
v0 = (( android.os.Parcel ) p1 ).readInt ( ); // invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I
/* if-nez v0, :cond_0 */
int p1 = 0; // const/4 p1, 0x0
} // :cond_0
v0 = android.content.Intent.CREATOR;
/* check-cast p1, Landroid/content/Intent; */
} // :goto_0
this.c = p1;
return;
} // .end method
public static java.lang.String a ( Integer p0 ) {
/* .locals 1 */
int v0 = -1; // const/4 v0, -0x1
/* if-eq p0, v0, :cond_1 */
if ( p0 != null) { // if-eqz p0, :cond_0
/* .line 2 */
java.lang.String .valueOf ( p0 );
} // :cond_0
final String p0 = "RESULT_CANCELED"; // const-string p0, "RESULT_CANCELED"
} // :cond_1
final String p0 = "RESULT_OK"; // const-string p0, "RESULT_OK"
} // .end method
/* # virtual methods */
public android.content.Intent a ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.c;
} // .end method
public Integer b ( ) {
/* .locals 1 */
/* .line 1 */
/* iget v0, p0, Lc/a/k/b;->b:I */
} // .end method
public Integer describeContents ( ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
} // .end method
public java.lang.String toString ( ) {
/* .locals 2 */
/* .line 1 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v1 = "ActivityResult{resultCode="; // const-string v1, "ActivityResult{resultCode="
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* iget v1, p0, Lc/a/k/b;->b:I */
/* .line 2 */
c.a.k.b .a ( v1 );
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v1 = ", data="; // const-string v1, ", data="
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = this.c;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
/* const/16 v1, 0x7d */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // .end method
public void writeToParcel ( android.os.Parcel p0, Integer p1 ) {
/* .locals 1 */
/* .line 1 */
/* iget v0, p0, Lc/a/k/b;->b:I */
(( android.os.Parcel ) p1 ).writeInt ( v0 ); // invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V
/* .line 2 */
v0 = this.c;
/* if-nez v0, :cond_0 */
int v0 = 0; // const/4 v0, 0x0
} // :cond_0
int v0 = 1; // const/4 v0, 0x1
} // :goto_0
(( android.os.Parcel ) p1 ).writeInt ( v0 ); // invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V
/* .line 3 */
v0 = this.c;
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 4 */
(( android.content.Intent ) v0 ).writeToParcel ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Landroid/content/Intent;->writeToParcel(Landroid/os/Parcel;I)V
} // :cond_1
return;
} // .end method
