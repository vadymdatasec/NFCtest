.class public final Le/f/d/d0/g0/o;
.super Le/f/d/a0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Le/f/d/a0<",
        "TT;>;"
    }
.end annotation


# instance fields
.field public final a:Le/f/d/d0/s;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Le/f/d/d0/s<",
            "TT;>;"
        }
    .end annotation
.end field

.field public final b:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Le/f/d/d0/g0/p;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Le/f/d/d0/g0/q;Le/f/d/d0/s;Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/f/d/d0/s<",
            "TT;>;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Le/f/d/d0/g0/p;",
            ">;)V"
        }
    .end annotation

    .line 2
    invoke-direct {p0}, Le/f/d/a0;-><init>()V

    .line 3
    iput-object p2, p0, Le/f/d/d0/g0/o;->a:Le/f/d/d0/s;

    .line 4
    iput-object p3, p0, Le/f/d/d0/g0/o;->b:Ljava/util/Map;

    return-void
.end method

.method public synthetic constructor <init>(Le/f/d/d0/g0/q;Le/f/d/d0/s;Ljava/util/Map;Le/f/d/d0/g0/n;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Le/f/d/d0/g0/o;-><init>(Le/f/d/d0/g0/q;Le/f/d/d0/s;Ljava/util/Map;)V

    return-void
.end method


# virtual methods
.method public a(Le/f/d/f0/c;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/f/d/f0/c;",
            ")TT;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Le/f/d/f0/c;->F()Le/f/d/f0/e;

    move-result-object v0

    sget-object v1, Le/f/d/f0/e;->j:Le/f/d/f0/e;

    if-ne v0, v1, :cond_0

    .line 2
    invoke-virtual {p1}, Le/f/d/f0/c;->B()V

    const/4 p1, 0x0

    return-object p1

    .line 3
    :cond_0
    iget-object v0, p0, Le/f/d/d0/g0/o;->a:Le/f/d/d0/s;

    invoke-interface {v0}, Le/f/d/d0/s;->a()Ljava/lang/Object;

    move-result-object v0

    .line 4
    :try_start_0
    invoke-virtual {p1}, Le/f/d/f0/c;->m()V

    .line 5
    :goto_0
    invoke-virtual {p1}, Le/f/d/f0/c;->u()Z

    move-result v1

    if-eqz v1, :cond_3

    .line 6
    invoke-virtual {p1}, Le/f/d/f0/c;->A()Ljava/lang/String;

    move-result-object v1

    .line 7
    iget-object v2, p0, Le/f/d/d0/g0/o;->b:Ljava/util/Map;

    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Le/f/d/d0/g0/p;

    if-eqz v1, :cond_2

    .line 8
    iget-boolean v2, v1, Le/f/d/d0/g0/p;->c:Z

    if-nez v2, :cond_1

    goto :goto_1

    .line 9
    :cond_1
    invoke-virtual {v1, p1, v0}, Le/f/d/d0/g0/p;->a(Le/f/d/f0/c;Ljava/lang/Object;)V

    goto :goto_0

    .line 10
    :cond_2
    :goto_1
    invoke-virtual {p1}, Le/f/d/f0/c;->J()V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 11
    :cond_3
    invoke-virtual {p1}, Le/f/d/f0/c;->r()V

    return-object v0

    :catch_0
    move-exception p1

    .line 12
    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0, p1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0

    :catch_1
    move-exception p1

    .line 13
    new-instance v0, Lcom/google/gson/JsonSyntaxException;

    invoke-direct {v0, p1}, Lcom/google/gson/JsonSyntaxException;-><init>(Ljava/lang/Throwable;)V

    throw v0
.end method

.method public a(Le/f/d/f0/g;Ljava/lang/Object;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/f/d/f0/g;",
            "TT;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    if-nez p2, :cond_0

    .line 14
    invoke-virtual {p1}, Le/f/d/f0/g;->s()Le/f/d/f0/g;

    return-void

    .line 15
    :cond_0
    invoke-virtual {p1}, Le/f/d/f0/g;->m()Le/f/d/f0/g;

    .line 16
    :try_start_0
    iget-object v0, p0, Le/f/d/d0/g0/o;->b:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Le/f/d/d0/g0/p;

    .line 17
    iget-boolean v2, v1, Le/f/d/d0/g0/p;->b:Z

    if-eqz v2, :cond_1

    .line 18
    iget-object v2, v1, Le/f/d/d0/g0/p;->a:Ljava/lang/String;

    invoke-virtual {p1, v2}, Le/f/d/f0/g;->b(Ljava/lang/String;)Le/f/d/f0/g;

    .line 19
    invoke-virtual {v1, p1, p2}, Le/f/d/d0/g0/p;->a(Le/f/d/f0/g;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 20
    :cond_2
    invoke-virtual {p1}, Le/f/d/f0/g;->o()Le/f/d/f0/g;

    return-void

    .line 21
    :catch_0
    new-instance p1, Ljava/lang/AssertionError;

    invoke-direct {p1}, Ljava/lang/AssertionError;-><init>()V

    throw p1
.end method
