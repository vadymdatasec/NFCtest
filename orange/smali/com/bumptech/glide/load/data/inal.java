public class inal implements e.b.a.y.w.g {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Lcom/bumptech/glide/load/data/ParcelFileDescriptorRewinder$InternalRewinder; */
	 /* } */
} // .end annotation
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/lang/Object;", */
/* "Le/b/a/y/w/g<", */
/* "Landroid/os/ParcelFileDescriptor;", */
/* ">;" */
/* } */
} // .end annotation
/* # instance fields */
public final com.bumptech.glide.load.data.ParcelFileDescriptorRewinder$InternalRewinder a;
/* # direct methods */
public inal ( ) {
/* .locals 1 */
/* .line 1 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 2 */
/* new-instance v0, Lcom/bumptech/glide/load/data/ParcelFileDescriptorRewinder$InternalRewinder; */
/* invoke-direct {v0, p1}, Lcom/bumptech/glide/load/data/ParcelFileDescriptorRewinder$InternalRewinder;-><init>(Landroid/os/ParcelFileDescriptor;)V */
this.a = v0;
return;
} // .end method
public static Boolean c ( ) {
/* .locals 2 */
/* .line 1 */
/* const/16 v1, 0x15 */
/* if-lt v0, v1, :cond_0 */
v0 = android.os.Build.FINGERPRINT;
final String v1 = "robolectric"; // const-string v1, "robolectric"
/* .line 2 */
v0 = (( java.lang.String ) v1 ).equals ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* if-nez v0, :cond_0 */
int v0 = 1; // const/4 v0, 0x1
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // .end method
/* # virtual methods */
public android.os.ParcelFileDescriptor a ( ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 2 */
v0 = this.a;
(( com.bumptech.glide.load.data.ParcelFileDescriptorRewinder$InternalRewinder ) v0 ).rewind ( ); // invoke-virtual {v0}, Lcom/bumptech/glide/load/data/ParcelFileDescriptorRewinder$InternalRewinder;->rewind()Landroid/os/ParcelFileDescriptor;
} // .end method
public java.lang.Object a ( ) { //bridge//synthethic
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 1 */
(( com.bumptech.glide.load.data.ParcelFileDescriptorRewinder ) p0 ).a ( ); // invoke-virtual {p0}, Lcom/bumptech/glide/load/data/ParcelFileDescriptorRewinder;->a()Landroid/os/ParcelFileDescriptor;
} // .end method
public void b ( ) {
/* .locals 0 */
return;
} // .end method
