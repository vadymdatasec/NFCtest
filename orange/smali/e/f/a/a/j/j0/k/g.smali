.class public abstract Le/f/a/a/j/j0/k/g;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Lcom/google/auto/value/AutoValue;
.end annotation


# static fields
.field public static final a:Le/f/a/a/j/j0/k/g;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    .line 1
    invoke-static {}, Le/f/a/a/j/j0/k/g;->f()Le/f/a/a/j/j0/k/f;

    move-result-object v0

    const-wide/32 v1, 0xa00000

    .line 2
    invoke-virtual {v0, v1, v2}, Le/f/a/a/j/j0/k/f;->b(J)Le/f/a/a/j/j0/k/f;

    const/16 v1, 0xc8

    .line 3
    invoke-virtual {v0, v1}, Le/f/a/a/j/j0/k/f;->b(I)Le/f/a/a/j/j0/k/f;

    const/16 v1, 0x2710

    .line 4
    invoke-virtual {v0, v1}, Le/f/a/a/j/j0/k/f;->a(I)Le/f/a/a/j/j0/k/f;

    const-wide/32 v1, 0x240c8400

    .line 5
    invoke-virtual {v0, v1, v2}, Le/f/a/a/j/j0/k/f;->a(J)Le/f/a/a/j/j0/k/f;

    const v1, 0x14000

    .line 6
    invoke-virtual {v0, v1}, Le/f/a/a/j/j0/k/f;->c(I)Le/f/a/a/j/j0/k/f;

    .line 7
    invoke-virtual {v0}, Le/f/a/a/j/j0/k/f;->a()Le/f/a/a/j/j0/k/g;

    move-result-object v0

    sput-object v0, Le/f/a/a/j/j0/k/g;->a:Le/f/a/a/j/j0/k/g;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static f()Le/f/a/a/j/j0/k/f;
    .locals 1

    .line 1
    new-instance v0, Le/f/a/a/j/j0/k/b;

    invoke-direct {v0}, Le/f/a/a/j/j0/k/b;-><init>()V

    return-object v0
.end method


# virtual methods
.method public abstract a()I
.end method

.method public abstract b()J
.end method

.method public abstract c()I
.end method

.method public abstract d()I
.end method

.method public abstract e()J
.end method
