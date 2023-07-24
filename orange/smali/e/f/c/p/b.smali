.class public Le/f/c/p/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le/f/c/p/d;


# instance fields
.field public a:Le/f/c/p/e;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    invoke-static {p1}, Le/f/c/p/e;->a(Landroid/content/Context;)Le/f/c/p/e;

    move-result-object p1

    iput-object p1, p0, Le/f/c/p/b;->a:Le/f/c/p/e;

    return-void
.end method

.method public static a()Le/f/c/k/e;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Le/f/c/k/e<",
            "Le/f/c/p/d;",
            ">;"
        }
    .end annotation

    .line 8
    const-class v0, Le/f/c/p/d;

    invoke-static {v0}, Le/f/c/k/e;->a(Ljava/lang/Class;)Le/f/c/k/e$a;

    move-result-object v0

    const-class v1, Landroid/content/Context;

    .line 9
    invoke-static {v1}, Le/f/c/k/u;->c(Ljava/lang/Class;)Le/f/c/k/u;

    move-result-object v1

    invoke-virtual {v0, v1}, Le/f/c/k/e$a;->a(Le/f/c/k/u;)Le/f/c/k/e$a;

    invoke-static {}, Le/f/c/p/a;->a()Le/f/c/k/k;

    move-result-object v1

    .line 10
    invoke-virtual {v0, v1}, Le/f/c/k/e$a;->a(Le/f/c/k/k;)Le/f/c/k/e$a;

    .line 11
    invoke-virtual {v0}, Le/f/c/k/e$a;->b()Le/f/c/k/e;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic a(Le/f/c/k/f;)Le/f/c/p/d;
    .locals 2

    .line 12
    new-instance v0, Le/f/c/p/b;

    const-class v1, Landroid/content/Context;

    invoke-interface {p0, v1}, Le/f/c/k/f;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/content/Context;

    invoke-direct {v0, p0}, Le/f/c/p/b;-><init>(Landroid/content/Context;)V

    return-object v0
.end method


# virtual methods
.method public a(Ljava/lang/String;)Le/f/c/p/c;
    .locals 3

    .line 1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    .line 2
    iget-object v2, p0, Le/f/c/p/b;->a:Le/f/c/p/e;

    invoke-virtual {v2, p1, v0, v1}, Le/f/c/p/e;->a(Ljava/lang/String;J)Z

    move-result p1

    .line 3
    iget-object v2, p0, Le/f/c/p/b;->a:Le/f/c/p/e;

    invoke-virtual {v2, v0, v1}, Le/f/c/p/e;->a(J)Z

    move-result v0

    if-eqz p1, :cond_0

    if-eqz v0, :cond_0

    .line 4
    sget-object p1, Le/f/c/p/c;->f:Le/f/c/p/c;

    return-object p1

    :cond_0
    if-eqz v0, :cond_1

    .line 5
    sget-object p1, Le/f/c/p/c;->e:Le/f/c/p/c;

    return-object p1

    :cond_1
    if-eqz p1, :cond_2

    .line 6
    sget-object p1, Le/f/c/p/c;->d:Le/f/c/p/c;

    return-object p1

    .line 7
    :cond_2
    sget-object p1, Le/f/c/p/c;->c:Le/f/c/p/c;

    return-object p1
.end method
