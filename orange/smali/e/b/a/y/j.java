public class e.b.a.y.j implements e.b.a.y.k {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public final com.bumptech.glide.load.data.ParcelFileDescriptorRewinder a; //synthetic
	 public final e.b.a.y.x.f1.b b; //synthetic
	 /* # direct methods */
	 public e.b.a.y.j ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 this.a = p1;
		 this.b = p2;
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public Integer a ( com.bumptech.glide.load.ImageHeaderParser p0 ) {
		 /* .locals 4 */
		 /* .annotation system Ldalvik/annotation/Throws; */
		 /* value = { */
		 /* Ljava/io/IOException; */
		 /* } */
	 } // .end annotation
	 int v0 = 0; // const/4 v0, 0x0
	 /* .line 1 */
	 try { // :try_start_0
		 /* new-instance v1, Le/b/a/y/z/e/m0; */
		 /* new-instance v2, Ljava/io/FileInputStream; */
		 v3 = this.a;
		 /* .line 2 */
		 (( com.bumptech.glide.load.data.ParcelFileDescriptorRewinder ) v3 ).a ( ); // invoke-virtual {v3}, Lcom/bumptech/glide/load/data/ParcelFileDescriptorRewinder;->a()Landroid/os/ParcelFileDescriptor;
		 (( android.os.ParcelFileDescriptor ) v3 ).getFileDescriptor ( ); // invoke-virtual {v3}, Landroid/os/ParcelFileDescriptor;->getFileDescriptor()Ljava/io/FileDescriptor;
		 /* invoke-direct {v2, v3}, Ljava/io/FileInputStream;-><init>(Ljava/io/FileDescriptor;)V */
		 v3 = this.b;
		 /* invoke-direct {v1, v2, v3}, Le/b/a/y/z/e/m0;-><init>(Ljava/io/InputStream;Le/b/a/y/x/f1/b;)V */
		 /* :try_end_0 */
		 /* .catchall {:try_start_0 ..:try_end_0} :catchall_1 */
		 /* .line 3 */
		 try { // :try_start_1
			 p1 = 			 v0 = this.b;
			 /* :try_end_1 */
			 /* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
			 /* .line 4 */
			 (( e.b.a.y.z.e.m0 ) v1 ).l ( ); // invoke-virtual {v1}, Le/b/a/y/z/e/m0;->l()V
			 /* .line 5 */
			 v0 = this.a;
			 (( com.bumptech.glide.load.data.ParcelFileDescriptorRewinder ) v0 ).a ( ); // invoke-virtual {v0}, Lcom/bumptech/glide/load/data/ParcelFileDescriptorRewinder;->a()Landroid/os/ParcelFileDescriptor;
			 /* :catchall_0 */
			 /* move-exception p1 */
			 /* move-object v0, v1 */
			 /* :catchall_1 */
			 /* move-exception p1 */
		 } // :goto_0
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 /* .line 6 */
			 (( e.b.a.y.z.e.m0 ) v0 ).l ( ); // invoke-virtual {v0}, Le/b/a/y/z/e/m0;->l()V
			 /* .line 7 */
		 } // :cond_0
		 v0 = this.a;
		 (( com.bumptech.glide.load.data.ParcelFileDescriptorRewinder ) v0 ).a ( ); // invoke-virtual {v0}, Lcom/bumptech/glide/load/data/ParcelFileDescriptorRewinder;->a()Landroid/os/ParcelFileDescriptor;
		 /* .line 8 */
		 /* throw p1 */
	 } // .end method
