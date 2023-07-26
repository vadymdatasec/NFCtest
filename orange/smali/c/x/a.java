public class c.x.a extends androidx.versionedparcelable.VersionedParcel {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public final android.util.SparseIntArray d;
	 public final android.os.Parcel e;
	 public final Integer f;
	 public final Integer g;
	 public final java.lang.String h;
	 public Integer i;
	 public Integer j;
	 public Integer k;
	 /* # direct methods */
	 public c.x.a ( ) {
		 /* .locals 8 */
		 /* .line 1 */
		 v2 = 		 (( android.os.Parcel ) p1 ).dataPosition ( ); // invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I
		 v3 = 		 (( android.os.Parcel ) p1 ).dataSize ( ); // invoke-virtual {p1}, Landroid/os/Parcel;->dataSize()I
		 /* new-instance v5, Lc/e/b; */
		 /* invoke-direct {v5}, Lc/e/b;-><init>()V */
		 /* new-instance v6, Lc/e/b; */
		 /* invoke-direct {v6}, Lc/e/b;-><init>()V */
		 /* new-instance v7, Lc/e/b; */
		 /* invoke-direct {v7}, Lc/e/b;-><init>()V */
		 final String v4 = ""; // const-string v4, ""
		 /* move-object v0, p0 */
		 /* move-object v1, p1 */
		 /* invoke-direct/range {v0 ..v7}, Lc/x/a;-><init>(Landroid/os/Parcel;IILjava/lang/String;Lc/e/b;Lc/e/b;Lc/e/b;)V */
		 return;
	 } // .end method
	 public c.x.a ( ) {
		 /* .locals 0 */
		 /* .annotation system Ldalvik/annotation/Signature; */
		 /* value = { */
		 /* "(", */
		 /* "Landroid/os/Parcel;", */
		 /* "II", */
		 /* "Ljava/lang/String;", */
		 /* "Lc/e/b<", */
		 /* "Ljava/lang/String;", */
		 /* "Ljava/lang/reflect/Method;", */
		 /* ">;", */
		 /* "Lc/e/b<", */
		 /* "Ljava/lang/String;", */
		 /* "Ljava/lang/reflect/Method;", */
		 /* ">;", */
		 /* "Lc/e/b<", */
		 /* "Ljava/lang/String;", */
		 /* "Ljava/lang/Class;", */
		 /* ">;)V" */
		 /* } */
	 } // .end annotation
	 /* .line 2 */
	 /* invoke-direct {p0, p5, p6, p7}, Landroidx/versionedparcelable/VersionedParcel;-><init>(Lc/e/b;Lc/e/b;Lc/e/b;)V */
	 /* .line 3 */
	 /* new-instance p5, Landroid/util/SparseIntArray; */
	 /* invoke-direct {p5}, Landroid/util/SparseIntArray;-><init>()V */
	 this.d = p5;
	 int p5 = -1; // const/4 p5, -0x1
	 /* .line 4 */
	 /* iput p5, p0, Lc/x/a;->i:I */
	 int p6 = 0; // const/4 p6, 0x0
	 /* .line 5 */
	 /* iput p6, p0, Lc/x/a;->j:I */
	 /* .line 6 */
	 /* iput p5, p0, Lc/x/a;->k:I */
	 /* .line 7 */
	 this.e = p1;
	 /* .line 8 */
	 /* iput p2, p0, Lc/x/a;->f:I */
	 /* .line 9 */
	 /* iput p3, p0, Lc/x/a;->g:I */
	 /* .line 10 */
	 /* iput p2, p0, Lc/x/a;->j:I */
	 /* .line 11 */
	 this.h = p4;
	 return;
} // .end method
/* # virtual methods */
public void a ( ) {
	 /* .locals 4 */
	 /* .line 9 */
	 /* iget v0, p0, Lc/x/a;->i:I */
	 /* if-ltz v0, :cond_0 */
	 /* .line 10 */
	 v1 = this.d;
	 v0 = 	 (( android.util.SparseIntArray ) v1 ).get ( v0 ); // invoke-virtual {v1, v0}, Landroid/util/SparseIntArray;->get(I)I
	 /* .line 11 */
	 v1 = this.e;
	 v1 = 	 (( android.os.Parcel ) v1 ).dataPosition ( ); // invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I
	 /* sub-int v2, v1, v0 */
	 /* .line 12 */
	 v3 = this.e;
	 (( android.os.Parcel ) v3 ).setDataPosition ( v0 ); // invoke-virtual {v3, v0}, Landroid/os/Parcel;->setDataPosition(I)V
	 /* .line 13 */
	 v0 = this.e;
	 (( android.os.Parcel ) v0 ).writeInt ( v2 ); // invoke-virtual {v0, v2}, Landroid/os/Parcel;->writeInt(I)V
	 /* .line 14 */
	 v0 = this.e;
	 (( android.os.Parcel ) v0 ).setDataPosition ( v1 ); // invoke-virtual {v0, v1}, Landroid/os/Parcel;->setDataPosition(I)V
} // :cond_0
return;
} // .end method
public void a ( android.os.Parcelable p0 ) {
/* .locals 2 */
/* .line 18 */
v0 = this.e;
int v1 = 0; // const/4 v1, 0x0
(( android.os.Parcel ) v0 ).writeParcelable ( p1, v1 ); // invoke-virtual {v0, p1, v1}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V
return;
} // .end method
public void a ( java.lang.CharSequence p0 ) {
/* .locals 2 */
/* .line 20 */
v0 = this.e;
int v1 = 0; // const/4 v1, 0x0
android.text.TextUtils .writeToParcel ( p1,v0,v1 );
return;
} // .end method
public void a ( Boolean p0 ) {
/* .locals 1 */
/* .line 19 */
v0 = this.e;
(( android.os.Parcel ) v0 ).writeInt ( p1 ); // invoke-virtual {v0, p1}, Landroid/os/Parcel;->writeInt(I)V
return;
} // .end method
public void a ( Object[] p0 ) {
/* .locals 2 */
if ( p1 != null) { // if-eqz p1, :cond_0
	 /* .line 15 */
	 v0 = this.e;
	 /* array-length v1, p1 */
	 (( android.os.Parcel ) v0 ).writeInt ( v1 ); // invoke-virtual {v0, v1}, Landroid/os/Parcel;->writeInt(I)V
	 /* .line 16 */
	 v0 = this.e;
	 (( android.os.Parcel ) v0 ).writeByteArray ( p1 ); // invoke-virtual {v0, p1}, Landroid/os/Parcel;->writeByteArray([B)V
	 /* .line 17 */
} // :cond_0
p1 = this.e;
int v0 = -1; // const/4 v0, -0x1
(( android.os.Parcel ) p1 ).writeInt ( v0 ); // invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V
} // :goto_0
return;
} // .end method
public Boolean a ( Integer p0 ) {
/* .locals 4 */
/* .line 1 */
} // :goto_0
/* iget v0, p0, Lc/x/a;->j:I */
/* iget v1, p0, Lc/x/a;->g:I */
int v2 = 1; // const/4 v2, 0x1
int v3 = 0; // const/4 v3, 0x0
/* if-ge v0, v1, :cond_2 */
/* .line 2 */
/* iget v0, p0, Lc/x/a;->k:I */
/* if-ne v0, p1, :cond_0 */
/* .line 3 */
} // :cond_0
java.lang.String .valueOf ( v0 );
java.lang.String .valueOf ( p1 );
v0 = (( java.lang.String ) v0 ).compareTo ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I
/* if-lez v0, :cond_1 */
/* .line 4 */
} // :cond_1
v0 = this.e;
/* iget v1, p0, Lc/x/a;->j:I */
(( android.os.Parcel ) v0 ).setDataPosition ( v1 ); // invoke-virtual {v0, v1}, Landroid/os/Parcel;->setDataPosition(I)V
/* .line 5 */
v0 = this.e;
v0 = (( android.os.Parcel ) v0 ).readInt ( ); // invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I
/* .line 6 */
v1 = this.e;
v1 = (( android.os.Parcel ) v1 ).readInt ( ); // invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I
/* iput v1, p0, Lc/x/a;->k:I */
/* .line 7 */
/* iget v1, p0, Lc/x/a;->j:I */
/* add-int/2addr v1, v0 */
/* iput v1, p0, Lc/x/a;->j:I */
/* .line 8 */
} // :cond_2
/* iget v0, p0, Lc/x/a;->k:I */
/* if-ne v0, p1, :cond_3 */
} // :cond_3
int v2 = 0; // const/4 v2, 0x0
} // :goto_1
} // .end method
public androidx.versionedparcelable.VersionedParcel b ( ) {
/* .locals 9 */
/* .line 6 */
/* new-instance v8, Lc/x/a; */
v1 = this.e;
v2 = (( android.os.Parcel ) v1 ).dataPosition ( ); // invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I
/* iget v0, p0, Lc/x/a;->j:I */
/* iget v3, p0, Lc/x/a;->f:I */
/* if-ne v0, v3, :cond_0 */
/* iget v0, p0, Lc/x/a;->g:I */
} // :cond_0
/* move v3, v0 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
v4 = this.h;
(( java.lang.StringBuilder ) v0 ).append ( v4 ); // invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v4 = " "; // const-string v4, " "
(( java.lang.StringBuilder ) v0 ).append ( v4 ); // invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
v5 = this.a;
v6 = this.b;
v7 = this.c;
/* move-object v0, v8 */
/* invoke-direct/range {v0 ..v7}, Lc/x/a;-><init>(Landroid/os/Parcel;IILjava/lang/String;Lc/e/b;Lc/e/b;Lc/e/b;)V */
} // .end method
public void b ( Integer p0 ) {
/* .locals 2 */
/* .line 1 */
(( c.x.a ) p0 ).a ( ); // invoke-virtual {p0}, Lc/x/a;->a()V
/* .line 2 */
/* iput p1, p0, Lc/x/a;->i:I */
/* .line 3 */
v0 = this.d;
v1 = this.e;
v1 = (( android.os.Parcel ) v1 ).dataPosition ( ); // invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I
(( android.util.SparseIntArray ) v0 ).put ( p1, v1 ); // invoke-virtual {v0, p1, v1}, Landroid/util/SparseIntArray;->put(II)V
int v0 = 0; // const/4 v0, 0x0
/* .line 4 */
(( c.x.a ) p0 ).c ( v0 ); // invoke-virtual {p0, v0}, Lc/x/a;->c(I)V
/* .line 5 */
(( c.x.a ) p0 ).c ( p1 ); // invoke-virtual {p0, p1}, Lc/x/a;->c(I)V
return;
} // .end method
public void b ( java.lang.String p0 ) {
/* .locals 1 */
/* .line 7 */
v0 = this.e;
(( android.os.Parcel ) v0 ).writeString ( p1 ); // invoke-virtual {v0, p1}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
return;
} // .end method
public void c ( Integer p0 ) {
/* .locals 1 */
/* .line 1 */
v0 = this.e;
(( android.os.Parcel ) v0 ).writeInt ( p1 ); // invoke-virtual {v0, p1}, Landroid/os/Parcel;->writeInt(I)V
return;
} // .end method
public Boolean d ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.e;
v0 = (( android.os.Parcel ) v0 ).readInt ( ); // invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I
if ( v0 != null) { // if-eqz v0, :cond_0
int v0 = 1; // const/4 v0, 0x1
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // .end method
public e ( ) {
/* .locals 2 */
/* .line 1 */
v0 = this.e;
v0 = (( android.os.Parcel ) v0 ).readInt ( ); // invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I
/* if-gez v0, :cond_0 */
int v0 = 0; // const/4 v0, 0x0
/* .line 2 */
} // :cond_0
/* new-array v0, v0, [B */
/* .line 3 */
v1 = this.e;
(( android.os.Parcel ) v1 ).readByteArray ( v0 ); // invoke-virtual {v1, v0}, Landroid/os/Parcel;->readByteArray([B)V
} // .end method
public java.lang.CharSequence f ( ) {
/* .locals 2 */
/* .line 1 */
v0 = android.text.TextUtils.CHAR_SEQUENCE_CREATOR;
v1 = this.e;
/* check-cast v0, Ljava/lang/CharSequence; */
} // .end method
public Integer g ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.e;
v0 = (( android.os.Parcel ) v0 ).readInt ( ); // invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I
} // .end method
public android.os.Parcelable h ( ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "<T::", */
/* "Landroid/os/Parcelable;", */
/* ">()TT;" */
/* } */
} // .end annotation
/* .line 1 */
v0 = this.e;
/* const-class v1, Lc/x/a; */
(( java.lang.Class ) v1 ).getClassLoader ( ); // invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;
(( android.os.Parcel ) v0 ).readParcelable ( v1 ); // invoke-virtual {v0, v1}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;
} // .end method
public java.lang.String i ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.e;
(( android.os.Parcel ) v0 ).readString ( ); // invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;
} // .end method
