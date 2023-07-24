.class public Le/f/c/l/e/q/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final f:Lk/o0;


# instance fields
.field public final a:Le/f/c/l/e/q/a;

.field public final b:Ljava/lang/String;

.field public final c:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public final d:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public e:Lk/j0;


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lk/o0;

    invoke-direct {v0}, Lk/o0;-><init>()V

    .line 2
    invoke-virtual {v0}, Lk/o0;->r()Lk/n0;

    move-result-object v0

    sget-object v1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v2, 0x2710

    .line 3
    invoke-virtual {v0, v2, v3, v1}, Lk/n0;->a(JLjava/util/concurrent/TimeUnit;)Lk/n0;

    .line 4
    invoke-virtual {v0}, Lk/n0;->a()Lk/o0;

    move-result-object v0

    sput-object v0, Le/f/c/l/e/q/b;->f:Lk/o0;

    return-void
.end method

.method public constructor <init>(Le/f/c/l/e/q/a;Ljava/lang/String;Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/f/c/l/e/q/a;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Le/f/c/l/e/q/b;->e:Lk/j0;

    .line 3
    iput-object p1, p0, Le/f/c/l/e/q/b;->a:Le/f/c/l/e/q/a;

    .line 4
    iput-object p2, p0, Le/f/c/l/e/q/b;->b:Ljava/lang/String;

    .line 5
    iput-object p3, p0, Le/f/c/l/e/q/b;->c:Ljava/util/Map;

    .line 6
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Le/f/c/l/e/q/b;->d:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;Ljava/lang/String;)Le/f/c/l/e/q/b;
    .locals 1

    .line 1
    iget-object v0, p0, Le/f/c/l/e/q/b;->d:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object p0
.end method

.method public a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)Le/f/c/l/e/q/b;
    .locals 0

    .line 3
    invoke-static {p3}, Lk/i0;->b(Ljava/lang/String;)Lk/i0;

    move-result-object p3

    .line 4
    invoke-static {p3, p4}, Lk/x0;->a(Lk/i0;Ljava/io/File;)Lk/x0;

    move-result-object p3

    .line 5
    invoke-virtual {p0}, Le/f/c/l/e/q/b;->c()Lk/j0;

    move-result-object p4

    invoke-virtual {p4, p1, p2, p3}, Lk/j0;->a(Ljava/lang/String;Ljava/lang/String;Lk/x0;)Lk/j0;

    iput-object p4, p0, Le/f/c/l/e/q/b;->e:Lk/j0;

    return-object p0
.end method

.method public a(Ljava/util/Map$Entry;)Le/f/c/l/e/q/b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map$Entry<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Le/f/c/l/e/q/b;"
        }
    .end annotation

    .line 2
    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, v0, p1}, Le/f/c/l/e/q/b;->a(Ljava/lang/String;Ljava/lang/String;)Le/f/c/l/e/q/b;

    return-object p0
.end method

.method public final a()Lk/u0;
    .locals 5

    .line 6
    new-instance v0, Lk/t0;

    invoke-direct {v0}, Lk/t0;-><init>()V

    new-instance v1, Lk/e;

    invoke-direct {v1}, Lk/e;-><init>()V

    .line 7
    invoke-virtual {v1}, Lk/e;->b()Lk/e;

    invoke-virtual {v1}, Lk/e;->a()Lk/f;

    move-result-object v1

    invoke-virtual {v0, v1}, Lk/t0;->a(Lk/f;)Lk/t0;

    .line 8
    iget-object v1, p0, Le/f/c/l/e/q/b;->b:Ljava/lang/String;

    invoke-static {v1}, Lk/f0;->e(Ljava/lang/String;)Lk/f0;

    move-result-object v1

    invoke-virtual {v1}, Lk/f0;->i()Lk/e0;

    move-result-object v1

    .line 9
    iget-object v2, p0, Le/f/c/l/e/q/b;->c:Ljava/util/Map;

    invoke-interface {v2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    .line 10
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {v1, v4, v3}, Lk/e0;->a(Ljava/lang/String;Ljava/lang/String;)Lk/e0;

    goto :goto_0

    .line 11
    :cond_0
    invoke-virtual {v1}, Lk/e0;->a()Lk/f0;

    move-result-object v1

    invoke-virtual {v0, v1}, Lk/t0;->a(Lk/f0;)Lk/t0;

    .line 12
    iget-object v1, p0, Le/f/c/l/e/q/b;->d:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    .line 13
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v0, v3, v2}, Lk/t0;->a(Ljava/lang/String;Ljava/lang/String;)Lk/t0;

    goto :goto_1

    .line 14
    :cond_1
    iget-object v1, p0, Le/f/c/l/e/q/b;->e:Lk/j0;

    if-nez v1, :cond_2

    const/4 v1, 0x0

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, Lk/j0;->a()Lk/l0;

    move-result-object v1

    .line 15
    :goto_2
    iget-object v2, p0, Le/f/c/l/e/q/b;->a:Le/f/c/l/e/q/a;

    invoke-virtual {v2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2, v1}, Lk/t0;->a(Ljava/lang/String;Lk/x0;)Lk/t0;

    .line 16
    invoke-virtual {v0}, Lk/t0;->a()Lk/u0;

    move-result-object v0

    return-object v0
.end method

.method public b(Ljava/lang/String;Ljava/lang/String;)Le/f/c/l/e/q/b;
    .locals 1

    .line 1
    invoke-virtual {p0}, Le/f/c/l/e/q/b;->c()Lk/j0;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lk/j0;->a(Ljava/lang/String;Ljava/lang/String;)Lk/j0;

    iput-object v0, p0, Le/f/c/l/e/q/b;->e:Lk/j0;

    return-object p0
.end method

.method public b()Le/f/c/l/e/q/d;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 2
    invoke-virtual {p0}, Le/f/c/l/e/q/b;->a()Lk/u0;

    move-result-object v0

    .line 3
    sget-object v1, Le/f/c/l/e/q/b;->f:Lk/o0;

    invoke-virtual {v1, v0}, Lk/o0;->a(Lk/u0;)Lk/g;

    move-result-object v0

    .line 4
    invoke-interface {v0}, Lk/g;->c()Lk/z0;

    move-result-object v0

    invoke-static {v0}, Le/f/c/l/e/q/d;->a(Lk/z0;)Le/f/c/l/e/q/d;

    move-result-object v0

    return-object v0
.end method

.method public final c()Lk/j0;
    .locals 2

    .line 1
    iget-object v0, p0, Le/f/c/l/e/q/b;->e:Lk/j0;

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Lk/j0;

    invoke-direct {v0}, Lk/j0;-><init>()V

    sget-object v1, Lk/l0;->f:Lk/i0;

    invoke-virtual {v0, v1}, Lk/j0;->a(Lk/i0;)Lk/j0;

    iput-object v0, p0, Le/f/c/l/e/q/b;->e:Lk/j0;

    .line 3
    :cond_0
    iget-object v0, p0, Le/f/c/l/e/q/b;->e:Lk/j0;

    return-object v0
.end method

.method public d()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Le/f/c/l/e/q/b;->a:Le/f/c/l/e/q/a;

    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
