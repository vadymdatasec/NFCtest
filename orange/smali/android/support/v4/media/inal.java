public class inal implements android.os.Parcelable {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # static fields */
	 public static final android.os.Parcelable$Creator CREATOR;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Landroid/os/Parcelable$Creator<", */
	 /* "Landroid/support/v4/media/RatingCompat;", */
	 /* ">;" */
	 /* } */
} // .end annotation
} // .end field
/* # instance fields */
public final Integer b;
public final Float c;
/* # direct methods */
public static inal ( ) {
/* .locals 1 */
/* .line 1 */
/* new-instance v0, Landroid/support/v4/media/RatingCompat$a; */
/* invoke-direct {v0}, Landroid/support/v4/media/RatingCompat$a;-><init>()V */
return;
} // .end method
public inal ( ) {
/* .locals 0 */
/* .line 1 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 2 */
/* iput p1, p0, Landroid/support/v4/media/RatingCompat;->b:I */
/* .line 3 */
/* iput p2, p0, Landroid/support/v4/media/RatingCompat;->c:F */
return;
} // .end method
/* # virtual methods */
public Integer describeContents ( ) {
/* .locals 1 */
/* .line 1 */
/* iget v0, p0, Landroid/support/v4/media/RatingCompat;->b:I */
} // .end method
public java.lang.String toString ( ) {
/* .locals 3 */
/* .line 1 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v1 = "Rating:style="; // const-string v1, "Rating:style="
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* iget v1, p0, Landroid/support/v4/media/RatingCompat;->b:I */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v1 = " rating="; // const-string v1, " rating="
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* iget v1, p0, Landroid/support/v4/media/RatingCompat;->c:F */
int v2 = 0; // const/4 v2, 0x0
/* cmpg-float v2, v1, v2 */
/* if-gez v2, :cond_0 */
final String v1 = "unrated"; // const-string v1, "unrated"
/* .line 2 */
} // :cond_0
java.lang.String .valueOf ( v1 );
} // :goto_0
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // .end method
public void writeToParcel ( android.os.Parcel p0, Integer p1 ) {
/* .locals 0 */
/* .line 1 */
/* iget p2, p0, Landroid/support/v4/media/RatingCompat;->b:I */
(( android.os.Parcel ) p1 ).writeInt ( p2 ); // invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V
/* .line 2 */
/* iget p2, p0, Landroid/support/v4/media/RatingCompat;->c:F */
(( android.os.Parcel ) p1 ).writeFloat ( p2 ); // invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeFloat(F)V
return;
} // .end method
