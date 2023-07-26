public class m.a.b.h.r extends javax.swing.table.AbstractTableModel {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static final org.apache.log4j.Logger k;
	 public static final java.util.Comparator l;
	 public static final m.a.b.h.j m;
	 public static java.lang.Class n; //synthetic
	 /* # instance fields */
	 public final java.lang.Object a;
	 public final java.util.SortedSet b;
	 public m.a.b.h.j c;
	 public final java.util.List d;
	 public Boolean e;
	 public java.lang.String f;
	 public java.lang.String g;
	 public java.lang.String h;
	 public java.lang.String i;
	 public org.apache.log4j.Priority j;
	 /* # direct methods */
	 public static m.a.b.h.r ( ) {
		 /* .locals 2 */
		 /* .line 1 */
		 v0 = m.a.b.h.r.n;
		 /* if-nez v0, :cond_0 */
		 final String v0 = "org.apache.log4j.chainsaw.MyTableModel"; // const-string v0, "org.apache.log4j.chainsaw.MyTableModel"
		 m.a.b.h.r .a ( v0 );
	 } // :cond_0
	 org.apache.log4j.Logger .getLogger ( v0 );
	 /* .line 2 */
	 /* new-instance v0, Lm/a/b/h/p; */
	 /* invoke-direct {v0}, Lm/a/b/h/p;-><init>()V */
	 int v0 = 0; // const/4 v0, 0x0
	 /* new-array v0, v0, [Lm/a/b/h/j; */
	 /* .line 3 */
	 int v0 = 3; // const/4 v0, 0x3
	 int v1 = 2; // const/4 v1, 0x2
	 /* .line 4 */
	 java.text.DateFormat .getDateTimeInstance ( v0,v1 );
	 return;
} // .end method
public m.a.b.h.r ( ) {
	 /* .locals 3 */
	 /* .line 1 */
	 /* invoke-direct {p0}, Ljavax/swing/table/AbstractTableModel;-><init>()V */
	 /* .line 2 */
	 /* new-instance v0, Ljava/lang/Object; */
	 /* invoke-direct {v0}, Ljava/lang/Object;-><init>()V */
	 this.a = v0;
	 /* .line 3 */
	 /* new-instance v0, Ljava/util/TreeSet; */
	 v1 = m.a.b.h.r.l;
	 /* invoke-direct {v0, v1}, Ljava/util/TreeSet;-><init>(Ljava/util/Comparator;)V */
	 this.b = v0;
	 /* .line 4 */
	 v0 = m.a.b.h.r.m;
	 this.c = v0;
	 /* .line 5 */
	 /* new-instance v0, Ljava/util/ArrayList; */
	 /* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
	 this.d = v0;
	 int v0 = 0; // const/4 v0, 0x0
	 /* .line 6 */
	 /* iput-boolean v0, p0, Lm/a/b/h/r;->e:Z */
	 final String v0 = ""; // const-string v0, ""
	 /* .line 7 */
	 this.f = v0;
	 /* .line 8 */
	 this.g = v0;
	 /* .line 9 */
	 this.h = v0;
	 /* .line 10 */
	 this.i = v0;
	 /* .line 11 */
	 v0 = org.apache.log4j.Priority.DEBUG;
	 this.j = v0;
	 /* .line 12 */
	 /* new-instance v0, Ljava/lang/Thread; */
	 /* new-instance v1, Lm/a/b/h/q; */
	 int v2 = 0; // const/4 v2, 0x0
	 /* invoke-direct {v1, p0, v2}, Lm/a/b/h/q;-><init>(Lm/a/b/h/r;Lm/a/b/h/p;)V */
	 /* invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V */
	 int v1 = 1; // const/4 v1, 0x1
	 /* .line 13 */
	 (( java.lang.Thread ) v0 ).setDaemon ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/Thread;->setDaemon(Z)V
	 /* .line 14 */
	 (( java.lang.Thread ) v0 ).start ( ); // invoke-virtual {v0}, Ljava/lang/Thread;->start()V
	 return;
} // .end method
public static java.lang.Class a ( java.lang.String p0 ) { //synthethic
	 /* .locals 1 */
	 /* .line 4 */
	 try { // :try_start_0
		 java.lang.Class .forName ( p0 );
		 /* :try_end_0 */
		 /* .catch Ljava/lang/ClassNotFoundException; {:try_start_0 ..:try_end_0} :catch_0 */
		 /* :catch_0 */
		 /* move-exception p0 */
		 /* new-instance v0, Ljava/lang/NoClassDefFoundError; */
		 /* invoke-direct {v0}, Ljava/lang/NoClassDefFoundError;-><init>()V */
		 (( java.lang.NoClassDefFoundError ) v0 ).initCause ( p0 ); // invoke-virtual {v0, p0}, Ljava/lang/NoClassDefFoundError;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;
		 /* throw p0 */
	 } // .end method
	 public static java.lang.Object a ( Object p0 ) { //synthethic
		 /* .locals 0 */
		 /* .line 1 */
		 p0 = this.a;
	 } // .end method
	 public static void a ( Object p0, Boolean p1 ) { //synthethic
		 /* .locals 0 */
		 /* .line 3 */
		 (( m.a.b.h.r ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Lm/a/b/h/r;->a(Z)V
		 return;
	 } // .end method
	 public static Boolean a ( Object p0, Object p1 ) { //synthethic
		 /* .locals 0 */
		 /* .line 2 */
		 p0 = 		 (( m.a.b.h.r ) p0 ).b ( p1 ); // invoke-virtual {p0, p1}, Lm/a/b/h/r;->b(Lm/a/b/h/j;)Z
	 } // .end method
	 public static Boolean b ( Object p0 ) { //synthethic
		 /* .locals 0 */
		 /* .line 1 */
		 /* iget-boolean p0, p0, Lm/a/b/h/r;->e:Z */
	 } // .end method
	 public static java.util.List c ( Object p0 ) { //synthethic
		 /* .locals 0 */
		 /* .line 1 */
		 p0 = this.d;
	 } // .end method
	 public static java.util.SortedSet d ( Object p0 ) { //synthethic
		 /* .locals 0 */
		 /* .line 1 */
		 p0 = this.b;
	 } // .end method
	 /* # virtual methods */
	 public void a ( Object p0 ) {
		 /* .locals 2 */
		 /* .line 9 */
		 v0 = this.a;
		 /* monitor-enter v0 */
		 /* .line 10 */
		 try { // :try_start_0
			 v1 = this.d;
			 /* .line 11 */
			 /* monitor-exit v0 */
			 return;
			 /* :catchall_0 */
			 /* move-exception p1 */
			 /* monitor-exit v0 */
			 /* :try_end_0 */
			 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
			 /* throw p1 */
		 } // .end method
		 public void a ( org.apache.log4j.Priority p0 ) {
			 /* .locals 1 */
			 /* .line 5 */
			 v0 = this.a;
			 /* monitor-enter v0 */
			 /* .line 6 */
			 try { // :try_start_0
				 this.j = p1;
				 int p1 = 0; // const/4 p1, 0x0
				 /* .line 7 */
				 (( m.a.b.h.r ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Lm/a/b/h/r;->a(Z)V
				 /* .line 8 */
				 /* monitor-exit v0 */
				 return;
				 /* :catchall_0 */
				 /* move-exception p1 */
				 /* monitor-exit v0 */
				 /* :try_end_0 */
				 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
				 /* throw p1 */
			 } // .end method
			 public final void a ( Boolean p0 ) {
				 /* .locals 7 */
				 /* .line 12 */
				 java.lang.System .currentTimeMillis ( );
				 /* move-result-wide v0 */
				 /* .line 13 */
				 /* new-instance v2, Ljava/util/ArrayList; */
				 /* invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V */
				 /* .line 14 */
				 v3 = 				 v3 = this.b;
				 /* .line 15 */
				 v4 = this.b;
				 /* .line 16 */
			 } // :cond_0
		 v5 = 		 } // :goto_0
		 if ( v5 != null) { // if-eqz v5, :cond_1
			 /* .line 17 */
			 /* check-cast v5, Lm/a/b/h/j; */
			 /* .line 18 */
			 v6 = 			 (( m.a.b.h.r ) p0 ).b ( v5 ); // invoke-virtual {p0, v5}, Lm/a/b/h/r;->b(Lm/a/b/h/j;)Z
			 if ( v6 != null) { // if-eqz v6, :cond_0
				 /* .line 19 */
				 /* .line 20 */
			 } // :cond_1
			 v4 = this.c;
			 /* array-length v5, v4 */
			 int v6 = 0; // const/4 v6, 0x0
			 /* if-nez v5, :cond_2 */
			 int v4 = 0; // const/4 v4, 0x0
		 } // :cond_2
		 /* aget-object v4, v4, v6 */
		 /* .line 21 */
	 } // :goto_1
	 v5 = m.a.b.h.r.m;
	 /* check-cast v5, [Lm/a/b/h/j; */
	 this.c = v5;
	 if ( p1 != null) { // if-eqz p1, :cond_4
		 if ( v4 != null) { // if-eqz v4, :cond_4
			 p1 = 			 /* .line 22 */
			 int v2 = 1; // const/4 v2, 0x1
			 /* if-ge p1, v2, :cond_3 */
			 /* .line 23 */
			 p1 = m.a.b.h.r.k;
			 final String v2 = "In strange state"; // const-string v2, "In strange state"
			 (( org.apache.log4j.Category ) p1 ).warn ( v2 ); // invoke-virtual {p1, v2}, Lorg/apache/log4j/Category;->warn(Ljava/lang/Object;)V
			 /* .line 24 */
			 (( m.a.b.h.r ) p0 ).fireTableDataChanged ( ); // invoke-virtual {p0}, Lm/a/b/h/r;->fireTableDataChanged()V
		 } // :cond_3
		 /* sub-int/2addr p1, v2 */
		 /* .line 25 */
		 (( m.a.b.h.r ) p0 ).fireTableRowsInserted ( v6, p1 ); // invoke-virtual {p0, v6, p1}, Lm/a/b/h/r;->fireTableRowsInserted(II)V
		 /* .line 26 */
	 } // :cond_4
	 (( m.a.b.h.r ) p0 ).fireTableDataChanged ( ); // invoke-virtual {p0}, Lm/a/b/h/r;->fireTableDataChanged()V
	 /* .line 27 */
} // :goto_2
java.lang.System .currentTimeMillis ( );
/* move-result-wide v4 */
/* .line 28 */
p1 = m.a.b.h.r.k;
/* new-instance v2, Ljava/lang/StringBuffer; */
/* invoke-direct {v2}, Ljava/lang/StringBuffer;-><init>()V */
final String v6 = "Total time [ms]: "; // const-string v6, "Total time [ms]: "
(( java.lang.StringBuffer ) v2 ).append ( v6 ); // invoke-virtual {v2, v6}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
/* sub-long/2addr v4, v0 */
(( java.lang.StringBuffer ) v2 ).append ( v4, v5 ); // invoke-virtual {v2, v4, v5}, Ljava/lang/StringBuffer;->append(J)Ljava/lang/StringBuffer;
final String v0 = " in update, size: "; // const-string v0, " in update, size: "
(( java.lang.StringBuffer ) v2 ).append ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
(( org.apache.log4j.Category ) p1 ).debug ( v0 ); // invoke-virtual {p1, v0}, Lorg/apache/log4j/Category;->debug(Ljava/lang/Object;)V
return;
} // .end method
public final Boolean b ( Object p0 ) {
/* .locals 3 */
/* .line 2 */
(( m.a.b.h.j ) p1 ).d ( ); // invoke-virtual {p1}, Lm/a/b/h/j;->d()Lorg/apache/log4j/Priority;
v1 = this.j;
v0 = (( org.apache.log4j.Priority ) v0 ).isGreaterOrEqual ( v1 ); // invoke-virtual {v0, v1}, Lorg/apache/log4j/Priority;->isGreaterOrEqual(Lorg/apache/log4j/Priority;)Z
int v1 = 0; // const/4 v1, 0x0
if ( v0 != null) { // if-eqz v0, :cond_3
	 (( m.a.b.h.j ) p1 ).e ( ); // invoke-virtual {p1}, Lm/a/b/h/j;->e()Ljava/lang/String;
	 v2 = this.f;
	 v0 = 	 (( java.lang.String ) v0 ).indexOf ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I
	 /* if-ltz v0, :cond_3 */
	 (( m.a.b.h.j ) p1 ).a ( ); // invoke-virtual {p1}, Lm/a/b/h/j;->a()Ljava/lang/String;
	 v2 = this.i;
	 v0 = 	 (( java.lang.String ) v0 ).indexOf ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I
	 /* if-ltz v0, :cond_3 */
	 v0 = this.h;
	 v0 = 	 (( java.lang.String ) v0 ).length ( ); // invoke-virtual {v0}, Ljava/lang/String;->length()I
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 (( m.a.b.h.j ) p1 ).c ( ); // invoke-virtual {p1}, Lm/a/b/h/j;->c()Ljava/lang/String;
		 if ( v0 != null) { // if-eqz v0, :cond_3
			 (( m.a.b.h.j ) p1 ).c ( ); // invoke-virtual {p1}, Lm/a/b/h/j;->c()Ljava/lang/String;
			 v2 = this.h;
			 v0 = 			 (( java.lang.String ) v0 ).indexOf ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I
			 /* if-ltz v0, :cond_3 */
			 /* .line 3 */
		 } // :cond_0
		 (( m.a.b.h.j ) p1 ).b ( ); // invoke-virtual {p1}, Lm/a/b/h/j;->b()Ljava/lang/String;
		 int v0 = 1; // const/4 v0, 0x1
		 /* if-nez p1, :cond_2 */
		 /* .line 4 */
		 p1 = this.g;
		 p1 = 		 (( java.lang.String ) p1 ).length ( ); // invoke-virtual {p1}, Ljava/lang/String;->length()I
		 /* if-nez p1, :cond_1 */
		 int v1 = 1; // const/4 v1, 0x1
	 } // :cond_1
	 /* .line 5 */
} // :cond_2
v2 = this.g;
p1 = (( java.lang.String ) p1 ).indexOf ( v2 ); // invoke-virtual {p1, v2}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I
/* if-ltz p1, :cond_3 */
int v1 = 1; // const/4 v1, 0x1
} // :cond_3
} // .end method
