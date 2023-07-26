public class c.b.k.q0 implements android.view.View$OnClickListener {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public final android.view.View b;
	 public final java.lang.String c;
	 public java.lang.reflect.Method d;
	 public android.content.Context e;
	 /* # direct methods */
	 public c.b.k.q0 ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 2 */
		 this.b = p1;
		 /* .line 3 */
		 this.c = p2;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public final void a ( android.content.Context p0, java.lang.String p1 ) {
		 /* .locals 4 */
	 } // :goto_0
	 if ( p1 != null) { // if-eqz p1, :cond_2
		 /* .line 1 */
		 try { // :try_start_0
			 p2 = 			 (( android.content.Context ) p1 ).isRestricted ( ); // invoke-virtual {p1}, Landroid/content/Context;->isRestricted()Z
			 /* if-nez p2, :cond_0 */
			 /* .line 2 */
			 (( java.lang.Object ) p1 ).getClass ( ); // invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
			 v0 = this.c;
			 int v1 = 1; // const/4 v1, 0x1
			 /* new-array v1, v1, [Ljava/lang/Class; */
			 int v2 = 0; // const/4 v2, 0x0
			 /* const-class v3, Landroid/view/View; */
			 /* aput-object v3, v1, v2 */
			 (( java.lang.Class ) p2 ).getMethod ( v0, v1 ); // invoke-virtual {p2, v0, v1}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
			 if ( p2 != null) { // if-eqz p2, :cond_0
				 /* .line 3 */
				 this.d = p2;
				 /* .line 4 */
				 this.e = p1;
				 /* :try_end_0 */
				 /* .catch Ljava/lang/NoSuchMethodException; {:try_start_0 ..:try_end_0} :catch_0 */
				 return;
				 /* :catch_0 */
				 /* nop */
				 /* .line 5 */
			 } // :cond_0
			 /* instance-of p2, p1, Landroid/content/ContextWrapper; */
			 if ( p2 != null) { // if-eqz p2, :cond_1
				 /* .line 6 */
				 /* check-cast p1, Landroid/content/ContextWrapper; */
				 (( android.content.ContextWrapper ) p1 ).getBaseContext ( ); // invoke-virtual {p1}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;
			 } // :cond_1
			 int p1 = 0; // const/4 p1, 0x0
			 /* .line 7 */
		 } // :cond_2
		 p1 = this.b;
		 p1 = 		 (( android.view.View ) p1 ).getId ( ); // invoke-virtual {p1}, Landroid/view/View;->getId()I
		 int p2 = -1; // const/4 p2, -0x1
		 /* if-ne p1, p2, :cond_3 */
		 final String p1 = ""; // const-string p1, ""
		 /* .line 8 */
	 } // :cond_3
	 /* new-instance p2, Ljava/lang/StringBuilder; */
	 /* invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V */
	 final String v0 = " with id \'"; // const-string v0, " with id \'"
	 (( java.lang.StringBuilder ) p2 ).append ( v0 ); // invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 v0 = this.b;
	 /* .line 9 */
	 (( android.view.View ) v0 ).getContext ( ); // invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;
	 (( android.content.Context ) v0 ).getResources ( ); // invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
	 (( android.content.res.Resources ) v0 ).getResourceEntryName ( p1 ); // invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getResourceEntryName(I)Ljava/lang/String;
	 (( java.lang.StringBuilder ) p2 ).append ( p1 ); // invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 final String p1 = "\'"; // const-string p1, "\'"
	 (( java.lang.StringBuilder ) p2 ).append ( p1 ); // invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) p2 ).toString ( ); // invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 /* .line 10 */
} // :goto_1
/* new-instance p2, Ljava/lang/IllegalStateException; */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v1 = "Could not find method "; // const-string v1, "Could not find method "
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = this.c;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v1 = "(View) in a parent or ancestor Context for android:onClick attribute defined on view "; // const-string v1, "(View) in a parent or ancestor Context for android:onClick attribute defined on view "
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = this.b;
/* .line 11 */
(( java.lang.Object ) v1 ).getClass ( ); // invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
/* throw p2 */
} // .end method
public void onClick ( android.view.View p0 ) {
/* .locals 4 */
/* .line 1 */
v0 = this.d;
/* if-nez v0, :cond_0 */
/* .line 2 */
v0 = this.b;
(( android.view.View ) v0 ).getContext ( ); // invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;
v1 = this.c;
(( c.b.k.q0 ) p0 ).a ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Lc/b/k/q0;->a(Landroid/content/Context;Ljava/lang/String;)V
/* .line 3 */
} // :cond_0
try { // :try_start_0
v0 = this.d;
v1 = this.e;
int v2 = 1; // const/4 v2, 0x1
/* new-array v2, v2, [Ljava/lang/Object; */
int v3 = 0; // const/4 v3, 0x0
/* aput-object p1, v2, v3 */
(( java.lang.reflect.Method ) v0 ).invoke ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
/* :try_end_0 */
/* .catch Ljava/lang/IllegalAccessException; {:try_start_0 ..:try_end_0} :catch_1 */
/* .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 ..:try_end_0} :catch_0 */
return;
/* :catch_0 */
/* move-exception p1 */
/* .line 4 */
/* new-instance v0, Ljava/lang/IllegalStateException; */
final String v1 = "Could not execute method for android:onClick"; // const-string v1, "Could not execute method for android:onClick"
/* invoke-direct {v0, v1, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V */
/* throw v0 */
/* :catch_1 */
/* move-exception p1 */
/* .line 5 */
/* new-instance v0, Ljava/lang/IllegalStateException; */
final String v1 = "Could not execute non-public method for android:onClick"; // const-string v1, "Could not execute non-public method for android:onClick"
/* invoke-direct {v0, v1, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V */
/* throw v0 */
} // .end method
