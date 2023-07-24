.class public final Le/f/e/p/b/h;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:I

.field public final b:I


# direct methods
.method public constructor <init>(II)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput p1, p0, Le/f/e/p/b/h;->a:I

    .line 4
    iput p2, p0, Le/f/e/p/b/h;->b:I

    return-void
.end method

.method public synthetic constructor <init>(IILe/f/e/p/b/g;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Le/f/e/p/b/h;-><init>(II)V

    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    .line 1
    iget v0, p0, Le/f/e/p/b/h;->a:I

    return v0
.end method

.method public b()I
    .locals 1

    .line 1
    iget v0, p0, Le/f/e/p/b/h;->b:I

    return v0
.end method
