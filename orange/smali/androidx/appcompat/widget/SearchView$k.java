public class androidx.appcompat.widget.SearchView$k {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Landroidx/appcompat/widget/SearchView; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x9 */
/* name = "k" */
} // .end annotation
/* # instance fields */
public java.lang.reflect.Method a;
public java.lang.reflect.Method b;
public java.lang.reflect.Method c;
/* # direct methods */
public androidx.appcompat.widget.SearchView$k ( ) {
/* .locals 6 */
/* .line 1 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
int v0 = 0; // const/4 v0, 0x0
int v1 = 1; // const/4 v1, 0x1
/* .line 2 */
try { // :try_start_0
	 /* const-class v2, Landroid/widget/AutoCompleteTextView; */
	 final String v3 = "doBeforeTextChanged"; // const-string v3, "doBeforeTextChanged"
	 /* new-array v4, v0, [Ljava/lang/Class; */
	 /* .line 3 */
	 (( java.lang.Class ) v2 ).getDeclaredMethod ( v3, v4 ); // invoke-virtual {v2, v3, v4}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
	 this.a = v2;
	 /* .line 4 */
	 (( java.lang.reflect.Method ) v2 ).setAccessible ( v1 ); // invoke-virtual {v2, v1}, Ljava/lang/reflect/Method;->setAccessible(Z)V
	 /* :try_end_0 */
	 /* .catch Ljava/lang/NoSuchMethodException; {:try_start_0 ..:try_end_0} :catch_0 */
	 /* .line 5 */
	 /* :catch_0 */
	 try { // :try_start_1
		 /* const-class v2, Landroid/widget/AutoCompleteTextView; */
		 final String v3 = "doAfterTextChanged"; // const-string v3, "doAfterTextChanged"
		 /* new-array v4, v0, [Ljava/lang/Class; */
		 /* .line 6 */
		 (( java.lang.Class ) v2 ).getDeclaredMethod ( v3, v4 ); // invoke-virtual {v2, v3, v4}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
		 this.b = v2;
		 /* .line 7 */
		 (( java.lang.reflect.Method ) v2 ).setAccessible ( v1 ); // invoke-virtual {v2, v1}, Ljava/lang/reflect/Method;->setAccessible(Z)V
		 /* :try_end_1 */
		 /* .catch Ljava/lang/NoSuchMethodException; {:try_start_1 ..:try_end_1} :catch_1 */
		 /* .line 8 */
		 /* :catch_1 */
		 try { // :try_start_2
			 /* const-class v2, Landroid/widget/AutoCompleteTextView; */
			 final String v3 = "ensureImeVisible"; // const-string v3, "ensureImeVisible"
			 /* new-array v4, v1, [Ljava/lang/Class; */
			 v5 = java.lang.Boolean.TYPE;
			 /* aput-object v5, v4, v0 */
			 /* .line 9 */
			 (( java.lang.Class ) v2 ).getMethod ( v3, v4 ); // invoke-virtual {v2, v3, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
			 this.c = v0;
			 /* .line 10 */
			 (( java.lang.reflect.Method ) v0 ).setAccessible ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/reflect/Method;->setAccessible(Z)V
			 /* :try_end_2 */
			 /* .catch Ljava/lang/NoSuchMethodException; {:try_start_2 ..:try_end_2} :catch_2 */
			 /* :catch_2 */
			 return;
		 } // .end method
		 /* # virtual methods */
		 public void a ( android.widget.AutoCompleteTextView p0 ) {
			 /* .locals 2 */
			 /* .line 1 */
			 v0 = this.b;
			 if ( v0 != null) { // if-eqz v0, :cond_0
				 int v1 = 0; // const/4 v1, 0x0
				 try { // :try_start_0
					 /* new-array v1, v1, [Ljava/lang/Object; */
					 /* .line 2 */
					 (( java.lang.reflect.Method ) v0 ).invoke ( p1, v1 ); // invoke-virtual {v0, p1, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
					 /* :try_end_0 */
					 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
					 /* :catch_0 */
				 } // :cond_0
				 return;
			 } // .end method
			 public void a ( android.widget.AutoCompleteTextView p0, Boolean p1 ) {
				 /* .locals 3 */
				 /* .line 3 */
				 v0 = this.c;
				 if ( v0 != null) { // if-eqz v0, :cond_0
					 int v1 = 1; // const/4 v1, 0x1
					 try { // :try_start_0
						 /* new-array v1, v1, [Ljava/lang/Object; */
						 int v2 = 0; // const/4 v2, 0x0
						 /* .line 4 */
						 java.lang.Boolean .valueOf ( p2 );
						 /* aput-object p2, v1, v2 */
						 (( java.lang.reflect.Method ) v0 ).invoke ( p1, v1 ); // invoke-virtual {v0, p1, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
						 /* :try_end_0 */
						 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
						 /* :catch_0 */
					 } // :cond_0
					 return;
				 } // .end method
				 public void b ( android.widget.AutoCompleteTextView p0 ) {
					 /* .locals 2 */
					 /* .line 1 */
					 v0 = this.a;
					 if ( v0 != null) { // if-eqz v0, :cond_0
						 int v1 = 0; // const/4 v1, 0x0
						 try { // :try_start_0
							 /* new-array v1, v1, [Ljava/lang/Object; */
							 /* .line 2 */
							 (( java.lang.reflect.Method ) v0 ).invoke ( p1, v1 ); // invoke-virtual {v0, p1, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
							 /* :try_end_0 */
							 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
							 /* :catch_0 */
						 } // :cond_0
						 return;
					 } // .end method
