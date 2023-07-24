.class public abstract Le/f/c/l/e/o/o3;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Lcom/google/auto/value/AutoValue;
.end annotation


# static fields
.field public static final a:Ljava/nio/charset/Charset;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-string v0, "UTF-8"

    .line 1
    invoke-static {v0}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v0

    sput-object v0, Le/f/c/l/e/o/o3;->a:Ljava/nio/charset/Charset;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic k()Ljava/nio/charset/Charset;
    .locals 1

    .line 1
    sget-object v0, Le/f/c/l/e/o/o3;->a:Ljava/nio/charset/Charset;

    return-object v0
.end method

.method public static l()Le/f/c/l/e/o/b2;
    .locals 1

    .line 1
    new-instance v0, Le/f/c/l/e/o/w;

    invoke-direct {v0}, Le/f/c/l/e/o/w;-><init>()V

    return-object v0
.end method


# virtual methods
.method public a(JZLjava/lang/String;)Le/f/c/l/e/o/o3;
    .locals 2

    .line 5
    invoke-virtual {p0}, Le/f/c/l/e/o/o3;->j()Le/f/c/l/e/o/b2;

    move-result-object v0

    .line 6
    invoke-virtual {p0}, Le/f/c/l/e/o/o3;->h()Le/f/c/l/e/o/m3;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 7
    invoke-virtual {p0}, Le/f/c/l/e/o/o3;->h()Le/f/c/l/e/o/m3;

    move-result-object v1

    invoke-virtual {v1, p1, p2, p3, p4}, Le/f/c/l/e/o/m3;->a(JZLjava/lang/String;)Le/f/c/l/e/o/m3;

    move-result-object p1

    invoke-virtual {v0, p1}, Le/f/c/l/e/o/b2;->a(Le/f/c/l/e/o/m3;)Le/f/c/l/e/o/b2;

    .line 8
    :cond_0
    invoke-virtual {v0}, Le/f/c/l/e/o/b2;->a()Le/f/c/l/e/o/o3;

    move-result-object p1

    return-object p1
.end method

.method public a(Le/f/c/l/e/o/h2;)Le/f/c/l/e/o/o3;
    .locals 2

    .line 4
    invoke-virtual {p0}, Le/f/c/l/e/o/o3;->j()Le/f/c/l/e/o/b2;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Le/f/c/l/e/o/b2;->a(Le/f/c/l/e/o/m3;)Le/f/c/l/e/o/b2;

    invoke-virtual {v0, p1}, Le/f/c/l/e/o/b2;->a(Le/f/c/l/e/o/h2;)Le/f/c/l/e/o/b2;

    invoke-virtual {v0}, Le/f/c/l/e/o/b2;->a()Le/f/c/l/e/o/o3;

    move-result-object p1

    return-object p1
.end method

.method public a(Le/f/c/l/e/o/p3;)Le/f/c/l/e/o/o3;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/f/c/l/e/o/p3<",
            "Le/f/c/l/e/o/h3;",
            ">;)",
            "Le/f/c/l/e/o/o3;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Le/f/c/l/e/o/o3;->h()Le/f/c/l/e/o/m3;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {p0}, Le/f/c/l/e/o/o3;->j()Le/f/c/l/e/o/b2;

    move-result-object v0

    invoke-virtual {p0}, Le/f/c/l/e/o/o3;->h()Le/f/c/l/e/o/m3;

    move-result-object v1

    invoke-virtual {v1, p1}, Le/f/c/l/e/o/m3;->a(Le/f/c/l/e/o/p3;)Le/f/c/l/e/o/m3;

    move-result-object p1

    invoke-virtual {v0, p1}, Le/f/c/l/e/o/b2;->a(Le/f/c/l/e/o/m3;)Le/f/c/l/e/o/b2;

    invoke-virtual {v0}, Le/f/c/l/e/o/b2;->a()Le/f/c/l/e/o/o3;

    move-result-object p1

    return-object p1

    .line 3
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Reports without sessions cannot have events added to them."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public abstract a()Ljava/lang/String;
.end method

.method public abstract b()Ljava/lang/String;
.end method

.method public abstract c()Ljava/lang/String;
.end method

.method public abstract d()Ljava/lang/String;
.end method

.method public abstract e()Le/f/c/l/e/o/h2;
.end method

.method public abstract f()I
.end method

.method public abstract g()Ljava/lang/String;
.end method

.method public abstract h()Le/f/c/l/e/o/m3;
.end method

.method public i()Le/f/c/l/e/o/n3;
    .locals 1

    .line 1
    invoke-virtual {p0}, Le/f/c/l/e/o/o3;->h()Le/f/c/l/e/o/m3;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    sget-object v0, Le/f/c/l/e/o/n3;->c:Le/f/c/l/e/o/n3;

    return-object v0

    .line 3
    :cond_0
    invoke-virtual {p0}, Le/f/c/l/e/o/o3;->e()Le/f/c/l/e/o/h2;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 4
    sget-object v0, Le/f/c/l/e/o/n3;->d:Le/f/c/l/e/o/n3;

    return-object v0

    .line 5
    :cond_1
    sget-object v0, Le/f/c/l/e/o/n3;->b:Le/f/c/l/e/o/n3;

    return-object v0
.end method

.method public abstract j()Le/f/c/l/e/o/b2;
.end method
