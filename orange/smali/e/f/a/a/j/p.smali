.class public abstract Le/f/a/a/j/p;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Lcom/google/auto/value/AutoValue$Builder;
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract a(J)Le/f/a/a/j/p;
.end method

.method public abstract a(Le/f/a/a/j/o;)Le/f/a/a/j/p;
.end method

.method public abstract a(Ljava/lang/Integer;)Le/f/a/a/j/p;
.end method

.method public abstract a(Ljava/lang/String;)Le/f/a/a/j/p;
.end method

.method public final a(Ljava/lang/String;I)Le/f/a/a/j/p;
    .locals 1

    .line 3
    invoke-virtual {p0}, Le/f/a/a/j/p;->b()Ljava/util/Map;

    move-result-object v0

    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p2

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object p0
.end method

.method public final a(Ljava/lang/String;J)Le/f/a/a/j/p;
    .locals 1

    .line 2
    invoke-virtual {p0}, Le/f/a/a/j/p;->b()Ljava/util/Map;

    move-result-object v0

    invoke-static {p2, p3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object p2

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object p0
.end method

.method public final a(Ljava/lang/String;Ljava/lang/String;)Le/f/a/a/j/p;
    .locals 1

    .line 1
    invoke-virtual {p0}, Le/f/a/a/j/p;->b()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object p0
.end method

.method public abstract a(Ljava/util/Map;)Le/f/a/a/j/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Le/f/a/a/j/p;"
        }
    .end annotation
.end method

.method public abstract a()Le/f/a/a/j/q;
.end method

.method public abstract b(J)Le/f/a/a/j/p;
.end method

.method public abstract b()Ljava/util/Map;
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
