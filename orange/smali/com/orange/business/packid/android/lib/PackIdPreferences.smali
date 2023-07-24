.class public Lcom/orange/business/packid/android/lib/PackIdPreferences;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final FORCE_CONNECTION_TIMEOUT_IN_SECONDS:I = 0xa

.field public static final INSTANCE:Lcom/orange/business/packid/android/lib/PackIdPreferences;


# instance fields
.field public a:Z

.field public b:Z

.field public c:Z

.field public d:Z

.field public e:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/orange/business/packid/android/lib/PackIdPreferences;

    invoke-direct {v0}, Lcom/orange/business/packid/android/lib/PackIdPreferences;-><init>()V

    sput-object v0, Lcom/orange/business/packid/android/lib/PackIdPreferences;->INSTANCE:Lcom/orange/business/packid/android/lib/PackIdPreferences;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/orange/business/packid/android/lib/PackIdPreferences;->a:Z

    .line 3
    iput-boolean v0, p0, Lcom/orange/business/packid/android/lib/PackIdPreferences;->b:Z

    const/4 v1, 0x1

    .line 4
    iput-boolean v1, p0, Lcom/orange/business/packid/android/lib/PackIdPreferences;->c:Z

    .line 5
    iput-boolean v0, p0, Lcom/orange/business/packid/android/lib/PackIdPreferences;->d:Z

    .line 6
    iput-boolean v0, p0, Lcom/orange/business/packid/android/lib/PackIdPreferences;->e:Z

    return-void
.end method


# virtual methods
.method public acceptHttp(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/orange/business/packid/android/lib/PackIdPreferences;->a:Z

    return-void
.end method

.method public isBleEnabled()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/orange/business/packid/android/lib/PackIdPreferences;->d:Z

    return v0
.end method

.method public isHttpAccepted()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/orange/business/packid/android/lib/PackIdPreferences;->a:Z

    return v0
.end method

.method public isNfcEnabled()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/orange/business/packid/android/lib/PackIdPreferences;->e:Z

    return v0
.end method

.method public isRssiBroadcastEnabled()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/orange/business/packid/android/lib/PackIdPreferences;->b:Z

    return v0
.end method

.method public isRssiLevelBroadcastEnabled()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/orange/business/packid/android/lib/PackIdPreferences;->c:Z

    return v0
.end method

.method public setBleEnabled(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/orange/business/packid/android/lib/PackIdPreferences;->d:Z

    return-void
.end method

.method public setEnableRssiBroadcast(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/orange/business/packid/android/lib/PackIdPreferences;->b:Z

    return-void
.end method

.method public setEnableRssiLevelBroadcast(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/orange/business/packid/android/lib/PackIdPreferences;->c:Z

    return-void
.end method

.method public setNfcEnabled(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/orange/business/packid/android/lib/PackIdPreferences;->e:Z

    return-void
.end method
