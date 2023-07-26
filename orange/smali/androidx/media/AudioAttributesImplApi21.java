public class androidx.media.AudioAttributesImplApi21 implements androidx.media.AudioAttributesImpl {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation build Landroid/annotation/TargetApi; */
	 /* value = 0x15 */
} // .end annotation
/* # instance fields */
public android.media.AudioAttributes a;
public Integer b;
/* # direct methods */
public androidx.media.AudioAttributesImplApi21 ( ) {
	 /* .locals 1 */
	 /* .line 1 */
	 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
	 int v0 = -1; // const/4 v0, -0x1
	 /* .line 2 */
	 /* iput v0, p0, Landroidx/media/AudioAttributesImplApi21;->b:I */
	 return;
} // .end method
/* # virtual methods */
public Boolean equals ( java.lang.Object p0 ) {
	 /* .locals 1 */
	 /* .line 1 */
	 /* instance-of v0, p1, Landroidx/media/AudioAttributesImplApi21; */
	 /* if-nez v0, :cond_0 */
	 int p1 = 0; // const/4 p1, 0x0
	 /* .line 2 */
} // :cond_0
/* check-cast p1, Landroidx/media/AudioAttributesImplApi21; */
/* .line 3 */
v0 = this.a;
p1 = this.a;
p1 = (( android.media.AudioAttributes ) v0 ).equals ( p1 ); // invoke-virtual {v0, p1}, Landroid/media/AudioAttributes;->equals(Ljava/lang/Object;)Z
} // .end method
public Integer hashCode ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.a;
v0 = (( android.media.AudioAttributes ) v0 ).hashCode ( ); // invoke-virtual {v0}, Landroid/media/AudioAttributes;->hashCode()I
} // .end method
public java.lang.String toString ( ) {
/* .locals 2 */
/* .line 1 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v1 = "AudioAttributesCompat: audioattributes="; // const-string v1, "AudioAttributesCompat: audioattributes="
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = this.a;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // .end method
