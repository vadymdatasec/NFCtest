.class public Le/f/a/a/j/c0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le/f/a/a/j/b0;


# static fields
.field public static volatile e:Le/f/a/a/j/e0;


# instance fields
.field public final a:Le/f/a/a/j/l0/a;

.field public final b:Le/f/a/a/j/l0/a;

.field public final c:Le/f/a/a/j/j0/e;

.field public final d:Le/f/a/a/j/j0/j/s;


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Le/f/a/a/j/l0/a;Le/f/a/a/j/l0/a;Le/f/a/a/j/j0/e;Le/f/a/a/j/j0/j/s;Le/f/a/a/j/j0/j/w;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Le/f/a/a/j/c0;->a:Le/f/a/a/j/l0/a;

    .line 3
    iput-object p2, p0, Le/f/a/a/j/c0;->b:Le/f/a/a/j/l0/a;

    .line 4
    iput-object p3, p0, Le/f/a/a/j/c0;->c:Le/f/a/a/j/j0/e;

    .line 5
    iput-object p4, p0, Le/f/a/a/j/c0;->d:Le/f/a/a/j/j0/j/s;

    .line 6
    invoke-virtual {p5}, Le/f/a/a/j/j0/j/w;->a()V

    return-void
.end method

.method public static a(Landroid/content/Context;)V
    .locals 2

    .line 1
    sget-object v0, Le/f/a/a/j/c0;->e:Le/f/a/a/j/e0;

    if-nez v0, :cond_1

    .line 2
    const-class v0, Le/f/a/a/j/c0;

    monitor-enter v0

    .line 3
    :try_start_0
    sget-object v1, Le/f/a/a/j/c0;->e:Le/f/a/a/j/e0;

    if-nez v1, :cond_0

    .line 4
    invoke-static {}, Le/f/a/a/j/l;->m()Le/f/a/a/j/d0;

    move-result-object v1

    .line 5
    invoke-interface {v1, p0}, Le/f/a/a/j/d0;->a(Landroid/content/Context;)Le/f/a/a/j/d0;

    .line 6
    invoke-interface {v1}, Le/f/a/a/j/d0;->a()Le/f/a/a/j/e0;

    move-result-object p0

    sput-object p0, Le/f/a/a/j/c0;->e:Le/f/a/a/j/e0;

    .line 7
    :cond_0
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0

    :cond_1
    :goto_0
    return-void
.end method

.method public static b()Le/f/a/a/j/c0;
    .locals 2

    .line 1
    sget-object v0, Le/f/a/a/j/c0;->e:Le/f/a/a/j/e0;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Le/f/a/a/j/e0;->l()Le/f/a/a/j/c0;

    move-result-object v0

    return-object v0

    .line 3
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Not initialized!"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static b(Le/f/a/a/j/m;)Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/f/a/a/j/m;",
            ")",
            "Ljava/util/Set<",
            "Le/f/a/a/b;",
            ">;"
        }
    .end annotation

    .line 4
    instance-of v0, p0, Le/f/a/a/j/n;

    if-eqz v0, :cond_0

    .line 5
    check-cast p0, Le/f/a/a/j/n;

    .line 6
    invoke-interface {p0}, Le/f/a/a/j/n;->b()Ljava/util/Set;

    move-result-object p0

    invoke-static {p0}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object p0

    return-object p0

    :cond_0
    const-string p0, "proto"

    .line 7
    invoke-static {p0}, Le/f/a/a/b;->a(Ljava/lang/String;)Le/f/a/a/b;

    move-result-object p0

    invoke-static {p0}, Ljava/util/Collections;->singleton(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(Le/f/a/a/j/m;)Le/f/a/a/g;
    .locals 4

    .line 8
    new-instance v0, Le/f/a/a/j/y;

    .line 9
    invoke-static {p1}, Le/f/a/a/j/c0;->b(Le/f/a/a/j/m;)Ljava/util/Set;

    move-result-object v1

    .line 10
    invoke-static {}, Le/f/a/a/j/x;->d()Le/f/a/a/j/x$a;

    move-result-object v2

    .line 11
    invoke-interface {p1}, Le/f/a/a/j/m;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Le/f/a/a/j/x$a;->a(Ljava/lang/String;)Le/f/a/a/j/x$a;

    .line 12
    invoke-interface {p1}, Le/f/a/a/j/m;->a()[B

    move-result-object p1

    invoke-virtual {v2, p1}, Le/f/a/a/j/x$a;->a([B)Le/f/a/a/j/x$a;

    .line 13
    invoke-virtual {v2}, Le/f/a/a/j/x$a;->a()Le/f/a/a/j/x;

    move-result-object p1

    invoke-direct {v0, v1, p1, p0}, Le/f/a/a/j/y;-><init>(Ljava/util/Set;Le/f/a/a/j/x;Le/f/a/a/j/b0;)V

    return-object v0
.end method

.method public a()Le/f/a/a/j/j0/j/s;
    .locals 1

    .line 14
    iget-object v0, p0, Le/f/a/a/j/c0;->d:Le/f/a/a/j/j0/j/s;

    return-object v0
.end method

.method public final a(Le/f/a/a/j/w;)Le/f/a/a/j/q;
    .locals 4

    .line 19
    invoke-static {}, Le/f/a/a/j/q;->i()Le/f/a/a/j/p;

    move-result-object v0

    iget-object v1, p0, Le/f/a/a/j/c0;->a:Le/f/a/a/j/l0/a;

    .line 20
    invoke-interface {v1}, Le/f/a/a/j/l0/a;->a()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Le/f/a/a/j/p;->a(J)Le/f/a/a/j/p;

    iget-object v1, p0, Le/f/a/a/j/c0;->b:Le/f/a/a/j/l0/a;

    .line 21
    invoke-interface {v1}, Le/f/a/a/j/l0/a;->a()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Le/f/a/a/j/p;->b(J)Le/f/a/a/j/p;

    .line 22
    invoke-virtual {p1}, Le/f/a/a/j/w;->f()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Le/f/a/a/j/p;->a(Ljava/lang/String;)Le/f/a/a/j/p;

    new-instance v1, Le/f/a/a/j/o;

    .line 23
    invoke-virtual {p1}, Le/f/a/a/j/w;->a()Le/f/a/a/b;

    move-result-object v2

    invoke-virtual {p1}, Le/f/a/a/j/w;->c()[B

    move-result-object v3

    invoke-direct {v1, v2, v3}, Le/f/a/a/j/o;-><init>(Le/f/a/a/b;[B)V

    invoke-virtual {v0, v1}, Le/f/a/a/j/p;->a(Le/f/a/a/j/o;)Le/f/a/a/j/p;

    .line 24
    invoke-virtual {p1}, Le/f/a/a/j/w;->b()Le/f/a/a/c;

    move-result-object p1

    invoke-virtual {p1}, Le/f/a/a/c;->a()Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, p1}, Le/f/a/a/j/p;->a(Ljava/lang/Integer;)Le/f/a/a/j/p;

    .line 25
    invoke-virtual {v0}, Le/f/a/a/j/p;->a()Le/f/a/a/j/q;

    move-result-object p1

    return-object p1
.end method

.method public a(Le/f/a/a/j/w;Le/f/a/a/h;)V
    .locals 3

    .line 15
    iget-object v0, p0, Le/f/a/a/j/c0;->c:Le/f/a/a/j/j0/e;

    .line 16
    invoke-virtual {p1}, Le/f/a/a/j/w;->e()Le/f/a/a/j/x;

    move-result-object v1

    invoke-virtual {p1}, Le/f/a/a/j/w;->b()Le/f/a/a/c;

    move-result-object v2

    invoke-virtual {v2}, Le/f/a/a/c;->c()Le/f/a/a/d;

    move-result-object v2

    invoke-virtual {v1, v2}, Le/f/a/a/j/x;->a(Le/f/a/a/d;)Le/f/a/a/j/x;

    move-result-object v1

    .line 17
    invoke-virtual {p0, p1}, Le/f/a/a/j/c0;->a(Le/f/a/a/j/w;)Le/f/a/a/j/q;

    move-result-object p1

    .line 18
    invoke-interface {v0, v1, p1, p2}, Le/f/a/a/j/j0/e;->a(Le/f/a/a/j/x;Le/f/a/a/j/q;Le/f/a/a/h;)V

    return-void
.end method
