.class public final synthetic Le/h/d/a/a/v/a;
.super Li/h/c/j;
.source "SourceFile"

# interfaces
.implements Li/h/b/l;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Li/h/c/j;",
        "Li/h/b/l<",
        "Landroid/content/Context;",
        "Le/h/d/a/a/v/b;",
        ">;"
    }
.end annotation


# static fields
.field public static final k:Le/h/d/a/a/v/a;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Le/h/d/a/a/v/a;

    invoke-direct {v0}, Le/h/d/a/a/v/a;-><init>()V

    sput-object v0, Le/h/d/a/a/v/a;->k:Le/h/d/a/a/v/a;

    return-void
.end method

.method public constructor <init>()V
    .locals 6

    const-class v2, Le/h/d/a/a/v/b;

    const/4 v1, 0x1

    const-string v3, "<init>"

    const-string v4, "<init>(Landroid/content/Context;)V"

    const/4 v5, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Li/h/c/j;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public final a(Landroid/content/Context;)Le/h/d/a/a/v/b;
    .locals 2

    const-string v0, "p0"

    invoke-static {p1, v0}, Li/h/c/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    new-instance v0, Le/h/d/a/a/v/b;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Le/h/d/a/a/v/b;-><init>(Landroid/content/Context;Li/h/c/g;)V

    return-object v0
.end method

.method public bridge synthetic a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Landroid/content/Context;

    invoke-virtual {p0, p1}, Le/h/d/a/a/v/a;->a(Landroid/content/Context;)Le/h/d/a/a/v/b;

    move-result-object p1

    return-object p1
.end method
