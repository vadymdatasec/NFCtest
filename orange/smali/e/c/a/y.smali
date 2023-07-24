.class public Le/c/a/y;
.super Le/c/a/b1;
.source "SourceFile"

# interfaces
.implements Le/c/a/z;


# instance fields
.field public n:Landroid/graphics/Matrix;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Le/c/a/b1;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/graphics/Matrix;)V
    .locals 0

    .line 1
    iput-object p1, p0, Le/c/a/y;->n:Landroid/graphics/Matrix;

    return-void
.end method
