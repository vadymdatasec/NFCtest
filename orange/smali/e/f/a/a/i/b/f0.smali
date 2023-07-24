.class public abstract Le/f/a/a/i/b/f0;
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

.method public static a(Ljava/lang/String;)Le/f/a/a/i/b/e0;
    .locals 1

    .line 1
    new-instance v0, Le/f/a/a/i/b/r;

    invoke-direct {v0}, Le/f/a/a/i/b/r;-><init>()V

    .line 2
    invoke-virtual {v0, p0}, Le/f/a/a/i/b/r;->a(Ljava/lang/String;)Le/f/a/a/i/b/e0;

    return-object v0
.end method

.method public static a([B)Le/f/a/a/i/b/e0;
    .locals 1

    .line 3
    new-instance v0, Le/f/a/a/i/b/r;

    invoke-direct {v0}, Le/f/a/a/i/b/r;-><init>()V

    .line 4
    invoke-virtual {v0, p0}, Le/f/a/a/i/b/r;->a([B)Le/f/a/a/i/b/e0;

    return-object v0
.end method


# virtual methods
.method public abstract a()Ljava/lang/Integer;
.end method

.method public abstract b()J
.end method

.method public abstract c()J
.end method

.method public abstract d()Le/f/a/a/i/b/m0;
.end method

.method public abstract e()[B
.end method

.method public abstract f()Ljava/lang/String;
.end method

.method public abstract g()J
.end method
