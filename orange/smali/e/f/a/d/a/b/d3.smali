.class public final Le/f/a/d/a/b/d3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le/f/a/d/a/e/a0;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Le/f/a/d/a/e/a0<",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Le/f/a/d/a/e/a0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Le/f/a/d/a/e/a0<",
            "Le/f/a/d/a/b/v2;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Le/f/a/d/a/e/a0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Le/f/a/d/a/e/a0<",
            "Landroid/content/Context;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Le/f/a/d/a/e/a0;Le/f/a/d/a/e/a0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/f/a/d/a/e/a0<",
            "Le/f/a/d/a/b/v2;",
            ">;",
            "Le/f/a/d/a/e/a0<",
            "Landroid/content/Context;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le/f/a/d/a/b/d3;->a:Le/f/a/d/a/e/a0;

    iput-object p2, p0, Le/f/a/d/a/b/d3;->b:Le/f/a/d/a/e/a0;

    return-void
.end method


# virtual methods
.method public final bridge synthetic a()Ljava/lang/Object;
    .locals 6

    iget-object v0, p0, Le/f/a/d/a/b/d3;->a:Le/f/a/d/a/e/a0;

    invoke-interface {v0}, Le/f/a/d/a/e/a0;->a()Ljava/lang/Object;

    move-result-object v0

    iget-object v1, p0, Le/f/a/d/a/b/d3;->b:Le/f/a/d/a/e/a0;

    check-cast v1, Le/f/a/d/a/b/f3;

    invoke-virtual {v1}, Le/f/a/d/a/b/f3;->b()Landroid/content/Context;

    move-result-object v1

    check-cast v0, Le/f/a/d/a/b/v2;

    invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v2

    new-instance v3, Landroid/content/ComponentName;

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v4

    const-string v5, "com.google.android.play.core.assetpacks.AssetPackExtractionService"

    invoke-direct {v3, v4, v5}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v4, 0x4

    invoke-static {v2, v3, v4}, Le/f/a/d/a/e/m;->a(Landroid/content/pm/PackageManager;Landroid/content/ComponentName;I)V

    invoke-static {v1}, Lcom/google/android/play/core/common/PlayCoreDialogWrapperActivity;->a(Landroid/content/Context;)V

    invoke-static {v0}, Le/f/a/d/a/e/m;->b(Ljava/lang/Object;)V

    return-object v0
.end method
