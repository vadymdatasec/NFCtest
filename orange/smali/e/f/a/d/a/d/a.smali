.class public abstract Le/f/a/d/a/d/a;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(IJJILjava/lang/String;)Le/f/a/d/a/d/a;
    .locals 9

    new-instance v8, Le/f/a/d/a/d/b;

    move-object v0, v8

    move v1, p0

    move-wide v2, p1

    move-wide v4, p3

    move v6, p5

    move-object v7, p6

    invoke-direct/range {v0 .. v7}, Le/f/a/d/a/d/b;-><init>(IJJILjava/lang/String;)V

    return-object v8
.end method


# virtual methods
.method public abstract a()J
.end method

.method public abstract b()I
.end method

.method public abstract c()I
.end method

.method public abstract d()Ljava/lang/String;
.end method

.method public abstract e()J
.end method
