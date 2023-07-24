.class public abstract Le/f/c/s/u/m;
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

.method public static d()Le/f/c/s/u/k;
    .locals 3

    .line 1
    new-instance v0, Le/f/c/s/u/e;

    invoke-direct {v0}, Le/f/c/s/u/e;-><init>()V

    const-wide/16 v1, 0x0

    invoke-virtual {v0, v1, v2}, Le/f/c/s/u/e;->a(J)Le/f/c/s/u/k;

    return-object v0
.end method


# virtual methods
.method public abstract a()Le/f/c/s/u/l;
.end method

.method public abstract b()Ljava/lang/String;
.end method

.method public abstract c()J
.end method
