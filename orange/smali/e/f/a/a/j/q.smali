.class public abstract Le/f/a/a/j/q;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Lcom/google/auto/value/AutoValue;
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static i()Le/f/a/a/j/p;
    .locals 2

    .line 1
    new-instance v0, Le/f/a/a/j/b;

    invoke-direct {v0}, Le/f/a/a/j/b;-><init>()V

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    invoke-virtual {v0, v1}, Le/f/a/a/j/b;->a(Ljava/util/Map;)Le/f/a/a/j/p;

    return-object v0
.end method


# virtual methods
.method public final a(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    invoke-virtual {p0}, Le/f/a/a/j/q;->a()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    if-nez p1, :cond_0

    const-string p1, ""

    :cond_0
    return-object p1
.end method

.method public abstract a()Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end method

.method public final b(Ljava/lang/String;)I
    .locals 1

    .line 1
    invoke-virtual {p0}, Le/f/a/a/j/q;->a()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    .line 2
    :cond_0
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    :goto_0
    return p1
.end method

.method public abstract b()Ljava/lang/Integer;
.end method

.method public final c(Ljava/lang/String;)J
    .locals 2

    .line 1
    invoke-virtual {p0}, Le/f/a/a/j/q;->a()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    if-nez p1, :cond_0

    const-wide/16 v0, 0x0

    goto :goto_0

    .line 2
    :cond_0
    invoke-static {p1}, Ljava/lang/Long;->valueOf(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    :goto_0
    return-wide v0
.end method

.method public abstract c()Le/f/a/a/j/o;
.end method

.method public abstract d()J
.end method

.method public final e()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Le/f/a/a/j/q;->a()Ljava/util/Map;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public abstract f()Ljava/lang/String;
.end method

.method public abstract g()J
.end method

.method public h()Le/f/a/a/j/p;
    .locals 3

    .line 1
    new-instance v0, Le/f/a/a/j/b;

    invoke-direct {v0}, Le/f/a/a/j/b;-><init>()V

    .line 2
    invoke-virtual {p0}, Le/f/a/a/j/q;->f()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Le/f/a/a/j/b;->a(Ljava/lang/String;)Le/f/a/a/j/p;

    .line 3
    invoke-virtual {p0}, Le/f/a/a/j/q;->b()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Le/f/a/a/j/p;->a(Ljava/lang/Integer;)Le/f/a/a/j/p;

    .line 4
    invoke-virtual {p0}, Le/f/a/a/j/q;->c()Le/f/a/a/j/o;

    move-result-object v1

    invoke-virtual {v0, v1}, Le/f/a/a/j/p;->a(Le/f/a/a/j/o;)Le/f/a/a/j/p;

    .line 5
    invoke-virtual {p0}, Le/f/a/a/j/q;->d()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Le/f/a/a/j/p;->a(J)Le/f/a/a/j/p;

    .line 6
    invoke-virtual {p0}, Le/f/a/a/j/q;->g()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Le/f/a/a/j/p;->b(J)Le/f/a/a/j/p;

    new-instance v1, Ljava/util/HashMap;

    .line 7
    invoke-virtual {p0}, Le/f/a/a/j/q;->a()Ljava/util/Map;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    invoke-virtual {v0, v1}, Le/f/a/a/j/p;->a(Ljava/util/Map;)Le/f/a/a/j/p;

    return-object v0
.end method
