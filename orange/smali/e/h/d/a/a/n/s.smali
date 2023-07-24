.class public final Le/h/d/a/a/n/s;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Le/h/d/a/a/n/s;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Le/h/d/a/a/n/s;

    invoke-direct {v0}, Le/h/d/a/a/n/s;-><init>()V

    sput-object v0, Le/h/d/a/a/n/s;->a:Le/h/d/a/a/n/s;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final b(Landroid/content/Context;)Z
    .locals 1

    const-string v0, "context"

    invoke-static {p0, v0}, Li/h/c/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    sget-object v0, Le/h/d/a/a/n/s;->a:Le/h/d/a/a/n/s;

    invoke-virtual {v0, p0}, Le/h/d/a/a/n/s;->a(Landroid/content/Context;)Landroid/app/KeyguardManager;

    move-result-object p0

    invoke-virtual {p0}, Landroid/app/KeyguardManager;->isKeyguardSecure()Z

    move-result p0

    return p0
.end method

.method public static final c(Landroid/content/Context;)Z
    .locals 1

    const-string v0, "context"

    invoke-static {p0, v0}, Li/h/c/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    sget-object v0, Le/h/d/a/a/n/s;->a:Le/h/d/a/a/n/s;

    invoke-virtual {v0, p0}, Le/h/d/a/a/n/s;->a(Landroid/content/Context;)Landroid/app/KeyguardManager;

    move-result-object p0

    invoke-virtual {p0}, Landroid/app/KeyguardManager;->isKeyguardLocked()Z

    move-result p0

    xor-int/lit8 p0, p0, 0x1

    return p0
.end method


# virtual methods
.method public final a(Landroid/content/Context;)Landroid/app/KeyguardManager;
    .locals 1

    const-string v0, "keyguard"

    .line 1
    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_0

    check-cast p1, Landroid/app/KeyguardManager;

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "null cannot be cast to non-null type android.app.KeyguardManager"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
