.class public final Le/b/a/y/z/i/e;
.super Landroid/graphics/drawable/Drawable$ConstantState;
.source "SourceFile"


# instance fields
.field public final a:Le/b/a/y/z/i/n;


# direct methods
.method public constructor <init>(Le/b/a/y/z/i/n;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroid/graphics/drawable/Drawable$ConstantState;-><init>()V

    .line 2
    iput-object p1, p0, Le/b/a/y/z/i/e;->a:Le/b/a/y/z/i/n;

    return-void
.end method


# virtual methods
.method public getChangingConfigurations()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public newDrawable()Landroid/graphics/drawable/Drawable;
    .locals 1

    .line 2
    new-instance v0, Le/b/a/y/z/i/f;

    invoke-direct {v0, p0}, Le/b/a/y/z/i/f;-><init>(Le/b/a/y/z/i/e;)V

    return-object v0
.end method

.method public newDrawable(Landroid/content/res/Resources;)Landroid/graphics/drawable/Drawable;
    .locals 0

    .line 1
    invoke-virtual {p0}, Le/b/a/y/z/i/e;->newDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object p1

    return-object p1
.end method
