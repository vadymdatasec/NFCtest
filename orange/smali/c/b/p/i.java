public class c.b.p.i implements android.view.MenuItem$OnMenuItemClickListener {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # static fields */
	 public static final java.lang.Class c;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "[", */
	 /* "Ljava/lang/Class<", */
	 /* "*>;" */
	 /* } */
} // .end annotation
} // .end field
/* # instance fields */
public java.lang.Object a;
public java.lang.reflect.Method b;
/* # direct methods */
public static c.b.p.i ( ) {
/* .locals 3 */
int v0 = 1; // const/4 v0, 0x1
/* new-array v0, v0, [Ljava/lang/Class; */
int v1 = 0; // const/4 v1, 0x0
/* .line 1 */
/* const-class v2, Landroid/view/MenuItem; */
/* aput-object v2, v0, v1 */
return;
} // .end method
public c.b.p.i ( ) {
/* .locals 4 */
/* .line 1 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 2 */
this.a = p1;
/* .line 3 */
(( java.lang.Object ) p1 ).getClass ( ); // invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
/* .line 4 */
try { // :try_start_0
	 v0 = c.b.p.i.c;
	 (( java.lang.Class ) p1 ).getMethod ( p2, v0 ); // invoke-virtual {p1, p2, v0}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
	 this.b = v0;
	 /* :try_end_0 */
	 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
	 return;
	 /* :catch_0 */
	 /* move-exception v0 */
	 /* .line 5 */
	 /* new-instance v1, Landroid/view/InflateException; */
	 /* new-instance v2, Ljava/lang/StringBuilder; */
	 /* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
	 final String v3 = "Couldn\'t resolve menu item onClick handler "; // const-string v3, "Couldn\'t resolve menu item onClick handler "
	 (( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v2 ).append ( p2 ); // invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 final String p2 = " in class "; // const-string p2, " in class "
	 (( java.lang.StringBuilder ) v2 ).append ( p2 ); // invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 /* .line 6 */
	 (( java.lang.Class ) p1 ).getName ( ); // invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;
	 (( java.lang.StringBuilder ) v2 ).append ( p1 ); // invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 /* invoke-direct {v1, p1}, Landroid/view/InflateException;-><init>(Ljava/lang/String;)V */
	 /* .line 7 */
	 (( android.view.InflateException ) v1 ).initCause ( v0 ); // invoke-virtual {v1, v0}, Landroid/view/InflateException;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;
	 /* .line 8 */
	 /* throw v1 */
} // .end method
/* # virtual methods */
public Boolean onMenuItemClick ( android.view.MenuItem p0 ) {
	 /* .locals 5 */
	 /* .line 1 */
	 try { // :try_start_0
		 v0 = this.b;
		 (( java.lang.reflect.Method ) v0 ).getReturnType ( ); // invoke-virtual {v0}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;
		 v1 = java.lang.Boolean.TYPE;
		 int v2 = 0; // const/4 v2, 0x0
		 int v3 = 1; // const/4 v3, 0x1
		 /* if-ne v0, v1, :cond_0 */
		 /* .line 2 */
		 v0 = this.b;
		 v1 = this.a;
		 /* new-array v3, v3, [Ljava/lang/Object; */
		 /* aput-object p1, v3, v2 */
		 (( java.lang.reflect.Method ) v0 ).invoke ( v1, v3 ); // invoke-virtual {v0, v1, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
		 /* check-cast p1, Ljava/lang/Boolean; */
		 p1 = 		 (( java.lang.Boolean ) p1 ).booleanValue ( ); // invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z
		 /* .line 3 */
	 } // :cond_0
	 v0 = this.b;
	 v1 = this.a;
	 /* new-array v4, v3, [Ljava/lang/Object; */
	 /* aput-object p1, v4, v2 */
	 (( java.lang.reflect.Method ) v0 ).invoke ( v1, v4 ); // invoke-virtual {v0, v1, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
	 /* :try_end_0 */
	 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
	 /* :catch_0 */
	 /* move-exception p1 */
	 /* .line 4 */
	 /* new-instance v0, Ljava/lang/RuntimeException; */
	 /* invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V */
	 /* throw v0 */
} // .end method
