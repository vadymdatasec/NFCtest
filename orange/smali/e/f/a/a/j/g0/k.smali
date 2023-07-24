.class public abstract Le/f/a/a/j/g0/k;
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

.method public static a(J)Le/f/a/a/j/g0/k;
    .locals 2

    .line 1
    new-instance v0, Le/f/a/a/j/g0/d;

    sget-object v1, Le/f/a/a/j/g0/j;->b:Le/f/a/a/j/g0/j;

    invoke-direct {v0, v1, p0, p1}, Le/f/a/a/j/g0/d;-><init>(Le/f/a/a/j/g0/j;J)V

    return-object v0
.end method

.method public static c()Le/f/a/a/j/g0/k;
    .locals 4

    .line 1
    new-instance v0, Le/f/a/a/j/g0/d;

    sget-object v1, Le/f/a/a/j/g0/j;->d:Le/f/a/a/j/g0/j;

    const-wide/16 v2, -0x1

    invoke-direct {v0, v1, v2, v3}, Le/f/a/a/j/g0/d;-><init>(Le/f/a/a/j/g0/j;J)V

    return-object v0
.end method

.method public static d()Le/f/a/a/j/g0/k;
    .locals 4

    .line 1
    new-instance v0, Le/f/a/a/j/g0/d;

    sget-object v1, Le/f/a/a/j/g0/j;->c:Le/f/a/a/j/g0/j;

    const-wide/16 v2, -0x1

    invoke-direct {v0, v1, v2, v3}, Le/f/a/a/j/g0/d;-><init>(Le/f/a/a/j/g0/j;J)V

    return-object v0
.end method


# virtual methods
.method public abstract a()J
.end method

.method public abstract b()Le/f/a/a/j/g0/j;
.end method
