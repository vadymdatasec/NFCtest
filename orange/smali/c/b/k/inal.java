public class inal implements java.lang.Thread$UncaughtExceptionHandler {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public final java.lang.Thread$UncaughtExceptionHandler a; //synthetic
	 /* # direct methods */
	 public inal ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 this.a = p1;
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public final Boolean a ( java.lang.Throwable p0 ) {
		 /* .locals 2 */
		 /* .line 1 */
		 /* instance-of v0, p1, Landroid/content/res/Resources$NotFoundException; */
		 int v1 = 0; // const/4 v1, 0x0
		 if ( v0 != null) { // if-eqz v0, :cond_1
			 /* .line 2 */
			 (( java.lang.Throwable ) p1 ).getMessage ( ); // invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;
			 if ( p1 != null) { // if-eqz p1, :cond_1
				 final String v0 = "drawable"; // const-string v0, "drawable"
				 /* .line 3 */
				 v0 = 				 (( java.lang.String ) p1 ).contains ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z
				 /* if-nez v0, :cond_0 */
				 final String v0 = "Drawable"; // const-string v0, "Drawable"
				 /* .line 4 */
				 p1 = 				 (( java.lang.String ) p1 ).contains ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z
				 if ( p1 != null) { // if-eqz p1, :cond_1
				 } // :cond_0
				 int v1 = 1; // const/4 v1, 0x1
			 } // :cond_1
		 } // .end method
		 public void uncaughtException ( java.lang.Thread p0, java.lang.Throwable p1 ) {
			 /* .locals 3 */
			 /* .line 1 */
			 v0 = 			 (( c.b.k.u ) p0 ).a ( p2 ); // invoke-virtual {p0, p2}, Lc/b/k/u;->a(Ljava/lang/Throwable;)Z
			 if ( v0 != null) { // if-eqz v0, :cond_0
				 /* .line 2 */
				 /* new-instance v0, Landroid/content/res/Resources$NotFoundException; */
				 /* new-instance v1, Ljava/lang/StringBuilder; */
				 /* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
				 /* .line 3 */
				 (( java.lang.Throwable ) p2 ).getMessage ( ); // invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;
				 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
				 final String v2 = ".If the resource you are trying to use is a vector resource, you may be referencing it in an unsupported way.See AppCompatDelegate.setCompatVectorFromResourcesEnabled() for more info."; // const-string v2, ".If the resource you are trying to use is a vector resource, you may be referencing it in an unsupported way.See AppCompatDelegate.setCompatVectorFromResourcesEnabled() for more info."
				 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
				 (( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
				 /* invoke-direct {v0, v1}, Landroid/content/res/Resources$NotFoundException;-><init>(Ljava/lang/String;)V */
				 /* .line 4 */
				 (( java.lang.Throwable ) p2 ).getCause ( ); // invoke-virtual {p2}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;
				 (( java.lang.Throwable ) v0 ).initCause ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;
				 /* .line 5 */
				 (( java.lang.Throwable ) p2 ).getStackTrace ( ); // invoke-virtual {p2}, Ljava/lang/Throwable;->getStackTrace()[Ljava/lang/StackTraceElement;
				 (( java.lang.Throwable ) v0 ).setStackTrace ( p2 ); // invoke-virtual {v0, p2}, Ljava/lang/Throwable;->setStackTrace([Ljava/lang/StackTraceElement;)V
				 /* .line 6 */
				 p2 = this.a;
				 /* .line 7 */
			 } // :cond_0
			 v0 = this.a;
		 } // :goto_0
		 return;
	 } // .end method
