package com.github.nicholasmoser.gnt4.seq;

import java.util.AbstractMap;
import java.util.Map;

public class Seq {
  // SEQ File Sections
  public static final String CHR_TBL = "chr_tbl";
  public static final String CHR_ACT = "chr_act";
  public static final String CHR_CAM = "chr_cam";
  public static final String CHR_SUB02 = "chr_sub02";
  public static final String CHR_MODEL = "chr_model";
  public static final String CHR_MOT = "chr_mot";
  public static final String CHR_HIRA = "chr_hira";
  public static final String CHR_SEL = "chr_sel";
  public static final String CHR_SHOT = "chr_shot";
  public static final String CHR_FACE = "chr_face";
  public static final String CHR_DATA = "chr_data";
  public static final String CHR_VISUAL2D = "chr_visual2d";

  // Notable Action IDs
  public static final int ACTION_5B = 0x0A0;
  public static final int ACTION_6B = 0x0A1;
  public static final int ACTION_4B = 0x0A2;
  public static final int ACTION_2B = 0x0A3;
  public static final int ACTION_RB = 0x0A5;
  public static final int ACTION_5A = 0x0B0;
  public static final int ACTION_6A = 0x0B1;
  public static final int ACTION_4A = 0x0B2;
  public static final int ACTION_2A = 0x0B3;
  public static final int ACTION_RA = 0x0B5;
  public static final int ACTION_RKNJ_GROUND = 0x0C0;
  public static final int ACTION_RKNJ_AIR = 0x0C1;
  public static final int ACTION_LKNJ = 0x0C2;
  public static final int ACTION_ZKNJ_INCOMING = 0x0C3;
  public static final int ACTION_5Z_OUTGOING = 0x0C6;
  public static final int ACTION_4Z_INCOMING = 0x0C7;
  public static final int ACTION_5Z_INCOMING = 0x0C8;
  public static final int ACTION_ZKNJ_OUTGOING = 0x0CB;
  public static final int ACTION_4Z_OUTGOING = 0x0CF;
  public static final int ACTION_JB = 0x0E0;
  public static final int ACTION_JA = 0x0E1;
  public static final int ACTION_8B = 0x0E2;
  public static final int ACTION_8A = 0x0E3;
  public static final int ACTION_5X = 0x121;
  public static final int ACTION_2X = 0x122;
  public static final int ACTION_COMBO_START = 0x130;
  public static final int ACTION_GROUND_THROW = 0x190;
  public static final int ACTION_BACK_GROUND_THROW = 0x191;
  public static final int ACTION_AIR_THROW = 0x192;
  public static final int ACTION_ACTIVATED_X = 0x193;

  public static final int PROGRESS_THROUGH_FRAMES_UNTIL_END = 0x13060020;
  public static final String PROGRESS_THROUGH_FRAMES_UNTIL_END_DESCRIPTION =
      "Single command, no value";

  public static final int ANIMATION_FLAG_ID = 0x0402023F;
  public static final String ANIMATION_FLAG_DESCRIPTION = "Animation Flag";

  public static final int X_MOVE_METER_REQ_ID = 0x227F2000;
  public static final String X_MOVE_METER_REQ_DESCRIPTION = "Meter Requirement for X Moves";

  public static final int HORIZ_MOBILITY_JUMP_MOVES_ID = 0x2414010B;
  public static final String HORIZ_MOBILITY_JUMP_MOVES_DESCRIPTION =
      "Horizontal Mobility for Jump Moves";

  public static final int VERT_MOBILITY_JUMP_MOVES_ID = 0x2414020B;
  public static final String VERT_MOBILITY_JUMP_MOVES_DESCRIPTION =
      "Vertical Mobility for Jump Moves";

  public static final int PROJ_DMG_STUN_GUARD_ID = 0x47040000;
  public static final String PROJ_DMG_STUN_GUARD_DESCRIPTION =
      "Projectile damage, stun, guard damage, etc";

  public static final int SYS_SOUND_EFFECT_ID = 0x24170000;
  public static final String SYS_SOUND_EFFECT_DESCRIPTION = "System Sound Effect";

  public static final int GFX_ID = 0x2A002626;
  public static final String GFX_DESCRPITION = "Graphics";

  public static final int CHR_SOUND_EFFECT_ID = 0x24170B00;
  public static final String CHR_SOUND_EFFECT_DESCRIPTION = "Character Sound Effect";

  public static final int CHR_ACT_ID = 0x013C0000;
  public static final String CHR_ACT_DESCRIPION = "Character Action";

  public static final int HITBOX_ACTIVE_FRAMES_ID = 0x21070026;
  public static final String HITBOX_ACTIVE_FRAMES_DESCRIPTION = "Hitbox Active Frames";

  public static final int HITBOX_LOC_SIZE_ID = 0x21040026;
  public static final String HITBOX_LOC_SIZE_DESCRIPTION = "Hitbox Locations and Sizes";

  public static final int POW_DMG_GRD_ID = 0x21050026;
  public static final String POW_DMG_GRD_DESCRIPTION = "POW, DMG, and GRD of a move";

  public static final int ANG_DIR_ID = 0x21060026;
  public static final String ANG_DIR_DESCRIPTION = "ANG and DIR of a move";

  // Synchronous timer will literally execute for the given amount.
  // e.g. the hex 2011263F_00000009_20120026 just no-ops in a loop for 9 frames.
  public static final int SYNCH_TIMER_BEGIN_ID = 0x2011263F;
  public static final String SYNCH_TIMER_BEGIN_DESCRIPTION = "Synchronous Timer Begin";

  public static final int SYNCH_TIMER_END_ID = 0x20120026;
  public static final String SYNCH_TIMER_END_DESCRIPTION = "Synchronous Timer End";

  public static final int PROJECTILE_INFO_ID = 0x47000026;
  public static final String PROJECTILE_INFO_DESCRIPTION = "Projectile Info";

  // Instructions that End the Action
  // 0x00000000_xxxxxxxx
  // 0x013C0000_00000000
  // 0x01320000 00012880 (Team super animation)
  // 0x01320000 0000A2C0
  // 0x01320000 0001D558 (Enter fall animation)
  // 0x01320000 0001BAC4 (Also fall animation)
  // 0x01320000 0001ACCC (Enter and attack in 3-man cell)

  // KF Flags
  public static final int KF_ATTACK_FLAG_ID = 0x241A1200;
  public static final String KF_ATTACK_FLAG_DESCRIPTION = "KF Attack Flags";
  public static final int KF_ATTACK_FLAG_PROJ_ID = 0x48040000;
  public static final String KF_ATTACK_FLAG_PROJ_DESCRIPTION = "KF Attack Flags (Projectile)";

  public static final Map<Integer, String> KF_ATTACK_FLAGS =
      Map.ofEntries(new AbstractMap.SimpleEntry<Integer, String>(0x00000001, "replay"), // No effect
          new AbstractMap.SimpleEntry<Integer, String>(0x00000002, "BDrive"), // Changes lighting,
                                                                              // no sub or tech
                                                                              // roll, generally on
                                                                              // Ougi moves
          new AbstractMap.SimpleEntry<Integer, String>(0x00000004, "Shot"),
          new AbstractMap.SimpleEntry<Integer, String>(0x00000008, "Pow_W"), // Weak hit. affects
                                                                             // blockstun and
                                                                             // hitstun
          new AbstractMap.SimpleEntry<Integer, String>(0x00000010, "Pow_M"), // Medium hit
          new AbstractMap.SimpleEntry<Integer, String>(0x00000020, "Pow_S"), // Strong hit
          new AbstractMap.SimpleEntry<Integer, String>(0x00000040, "Low"), // Attack hits low, and
                                                                           // can be evaded by AF
                                                                           // float flag
          new AbstractMap.SimpleEntry<Integer, String>(0x00000080, "Middle"), // Attack hits middle
          new AbstractMap.SimpleEntry<Integer, String>(0x00000100, "High"), // Attack hits high, and
                                                                            // can be evaded by AF
                                                                            // sit flag
          new AbstractMap.SimpleEntry<Integer, String>(0x00000200, "Punch"), // Attack is classified
                                                                             // as a punch
          new AbstractMap.SimpleEntry<Integer, String>(0x00000400, "Kick"), // Attack is classified
                                                                            // as a kick
          new AbstractMap.SimpleEntry<Integer, String>(0x00000800, "Throw"), // Attack is classified
                                                                             // as a throw, no sub
                                                                             // or tech roll
          new AbstractMap.SimpleEntry<Integer, String>(0x00001000, "Oiuchi"), // Hits later on OTG
                                                                              // and during tech
                                                                              // rolls (also called
                                                                              // “Pursuit”)
          new AbstractMap.SimpleEntry<Integer, String>(0x00002000, "Special"), // Builds no chakra,
                                                                               // generally seen on
                                                                               // Ougi moves
          new AbstractMap.SimpleEntry<Integer, String>(0x00004000, "NoGuard"), // Unblockable
          new AbstractMap.SimpleEntry<Integer, String>(0x00008000, "TDown"),
          new AbstractMap.SimpleEntry<Integer, String>(0x00010000, "SPTata"), // This is a large
                                                                              // bounce. Ex: Naruto
                                                                              // 4B
          new AbstractMap.SimpleEntry<Integer, String>(0x00020000, "Break"), // This combines with
                                                                             // other KF flags to
                                                                             // affect the opponents
                                                                             // guard.
          new AbstractMap.SimpleEntry<Integer, String>(0x00040000, "Combo"), // Still not entirely
                                                                             // understood
          new AbstractMap.SimpleEntry<Integer, String>(0x00080000, "Down"), // Spinout launcher.
                                                                            // Launches higher than
                                                                            // Uki flag
          new AbstractMap.SimpleEntry<Integer, String>(0x00100000, "Yoro"), // Stagger
          new AbstractMap.SimpleEntry<Integer, String>(0x00200000, "Butt"), // Flying Screen
                                                                            // knockback
          new AbstractMap.SimpleEntry<Integer, String>(0x00400000, "Uki"), // Launch on hit
          new AbstractMap.SimpleEntry<Integer, String>(0x00800000, "Furi"), // Turns opponents
                                                                            // around on hit. This
                                                                            // is leftover from
                                                                            // Bloody Roar and not
                                                                            // used.
          new AbstractMap.SimpleEntry<Integer, String>(0x01000000, "Koro"), // Sweep: beats super
                                                                            // armor, cannot be Y
                                                                            // cancelled
          new AbstractMap.SimpleEntry<Integer, String>(0x02000000, "Reach_L"), // Unsure, but
                                                                               // generally in
                                                                               // attacks with a
                                                                               // good deal of
                                                                               // motion. Ex: Naruto
                                                                               // 6B
          new AbstractMap.SimpleEntry<Integer, String>(0x04000000, "Tata"), // Small Ground Bounce.
                                                                            // Ex: Naruto 6B
          new AbstractMap.SimpleEntry<Integer, String>(0x08000000, "NoSpeEp"),
          new AbstractMap.SimpleEntry<Integer, String>(0x10000000, "Beast"), // Slash hit effect and
                                                                             // chip damage
          new AbstractMap.SimpleEntry<Integer, String>(0x20000000, "Freeze"), // Opponent moves less
                                                                              // during the attack,
                                                                              // which allows moves
                                                                              // to combo better
          new AbstractMap.SimpleEntry<Integer, String>(0x40000000, "Cancel"), // Cancel the move
                                                                              // when you press Y
                                                                              // like an any frame
                                                                              // feint (not used)
          new AbstractMap.SimpleEntry<Integer, String>(0x80000000, "AtkCan") // Super Cancel
      );

  // K2F Flags
  public static final int K2F_SPECIAL_ATTACK_FLAG_ID = 0x241A4800;
  public static final String intK2F_SPECIAL_ATTACK_FLAG_DESCRIPTION = "K2F Special Attack Flags";
  public static final int K2F_SPECIAL_ATTACK_PROJ_FLAG_ID = 0x48150000;
  public static final String K2F_SPECIAL_ATTACK_PROJ_FLAG_DESCRIPTION =
      "K2F Special Attack Flags (Projectile)";
  public static final Map<Integer, String> K2F_SPECIAL_ATTACK_FLAGS =
      Map.ofEntries(new AbstractMap.SimpleEntry<Integer, String>(0x00000001, "yoro2"), // Feet
                                                                                       // trapped.
                                                                                       // Ex:
                                                                                       // Kidomaru
                                                                                       // 5A1C
          new AbstractMap.SimpleEntry<Integer, String>(0x00000002, "hiki"), // Sink into the ground
                                                                            // and pop out. Ex:
                                                                            // Jiraya 2A
          new AbstractMap.SimpleEntry<Integer, String>(0x00000004, "hiki2"), // Sink into the ground
                                                                             // and fall from above.
                                                                             // Ex: Shika 2X
          new AbstractMap.SimpleEntry<Integer, String>(0x00000008, "mission"),
          new AbstractMap.SimpleEntry<Integer, String>(0x00000010, "natemi"),
          new AbstractMap.SimpleEntry<Integer, String>(0x00000020, "superarmor"), // Gives the move
                                                                                  // super armor,
                                                                                  // must be turned
                                                                                  // off. Ex: Chouji
                                                                                  // 5A
          new AbstractMap.SimpleEntry<Integer, String>(0x00000040, "mato2"), // Trapped. Ex: Shino
                                                                             // 2A
          new AbstractMap.SimpleEntry<Integer, String>(0x00000080, "atkallcan"), // Can follow up
                                                                                 // with any other
                                                                                 // attack
          new AbstractMap.SimpleEntry<Integer, String>(0x00000100, "toji"),
          new AbstractMap.SimpleEntry<Integer, String>(0x00000200, "hasa"), // Crumple. Ex: Jirobo
                                                                            // stone clap crumple
          new AbstractMap.SimpleEntry<Integer, String>(0x00000400, "shave"), // For Kisame.
          new AbstractMap.SimpleEntry<Integer, String>(0x00000800, "nemu"), // Sleep. Ex: Kabuto 2X
          new AbstractMap.SimpleEntry<Integer, String>(0x00001000, "wing"), // ex: Kabuto 2X
          new AbstractMap.SimpleEntry<Integer, String>(0x00002000, "null1"), // Crumple. Ex: OTK 2X
          new AbstractMap.SimpleEntry<Integer, String>(0x00004000, "null2"));

  // NF Flags
  public static final int NF_STATE_FLAG_ID = 0x241A0900;
  public static final String NF_STATE_FLAG_DESCRIPTION = "NF State Flags";
  public static final Map<Integer, String> NF_STATE_FLAGS =
      Map.ofEntries(new AbstractMap.SimpleEntry<Integer, String>(0x00000001, "kamae"),
          new AbstractMap.SimpleEntry<Integer, String>(0x00000002, "disp"), // Disappears, can even
                                                                            // walk through opponent
                                                                            // while invisible.
          new AbstractMap.SimpleEntry<Integer, String>(0x00000004, "tdmg"), // Used in conjuction
                                                                            // with tdown for
                                                                            // intangibility.
          new AbstractMap.SimpleEntry<Integer, String>(0x00000008, "jump2"), // Flag that appears
                                                                             // after doing your
                                                                             // midair jump
          new AbstractMap.SimpleEntry<Integer, String>(0x00000010, "leverdir"),
          new AbstractMap.SimpleEntry<Integer, String>(0x00000020, "getup"),
          new AbstractMap.SimpleEntry<Integer, String>(0x00000040, "hiteft"),
          new AbstractMap.SimpleEntry<Integer, String>(0x00000080, "nfog"),
          new AbstractMap.SimpleEntry<Integer, String>(0x00000100, "takeon"),
          new AbstractMap.SimpleEntry<Integer, String>(0x00000200, "(blank)"),
          new AbstractMap.SimpleEntry<Integer, String>(0x00000400, "bdrivesleep"), // Makes BDrive
                                                                                   // not active.
          new AbstractMap.SimpleEntry<Integer, String>(0x00000800, "jump"),
          new AbstractMap.SimpleEntry<Integer, String>(0x00001000, "fall"),
          new AbstractMap.SimpleEntry<Integer, String>(0x00002000, "jspd"),
          new AbstractMap.SimpleEntry<Integer, String>(0x00004000, "shotdef"), // Expected this to
                                                                               // block projectiles.
                                                                               // It didn"t.
          new AbstractMap.SimpleEntry<Integer, String>(0x00008000, "move"),
          new AbstractMap.SimpleEntry<Integer, String>(0x00010000, "attack"),
          new AbstractMap.SimpleEntry<Integer, String>(0x00020000, "button"),
          new AbstractMap.SimpleEntry<Integer, String>(0x00040000, "combo"),
          new AbstractMap.SimpleEntry<Integer, String>(0x00080000, "disp_n"), // Disappears. Ends at
                                                                              // the end of the
                                                                              // action..?
          new AbstractMap.SimpleEntry<Integer, String>(0x00100000, "kabehit"),
          new AbstractMap.SimpleEntry<Integer, String>(0x00200000, "bodytouch"), // Used for some
                                                                                 // throw attacks
                                                                                 // like Kisame.
                                                                                 // Disables sub.
          new AbstractMap.SimpleEntry<Integer, String>(0x00400000, "aguard"),
          new AbstractMap.SimpleEntry<Integer, String>(0x00800000, "damage"),
          new AbstractMap.SimpleEntry<Integer, String>(0x01000000, "guard"),
          new AbstractMap.SimpleEntry<Integer, String>(0x02000000, "autodir"), // Determines if
                                                                               // something has any
                                                                               // tracking on it..?
          new AbstractMap.SimpleEntry<Integer, String>(0x04000000, "eneauto"),
          new AbstractMap.SimpleEntry<Integer, String>(0x08000000, "njpturn"),
          new AbstractMap.SimpleEntry<Integer, String>(0x10000000, "ringout"),
          new AbstractMap.SimpleEntry<Integer, String>(0x20000000, "kabe"),
          new AbstractMap.SimpleEntry<Integer, String>(0x40000000, "tdown"),
          new AbstractMap.SimpleEntry<Integer, String>(0x80000000, "lever"));

  // AF Flags
  public static final int AF_ACTION_STATE_FLAG_ID = 0x241A0000;
  public static final String AF_ACTION_STATE_FLAG_DESCRIPTION = "AF Action State Flags";
  public static final Map<Integer, String> AF_ACTION_STATE_FLAGS =
      Map.ofEntries(new AbstractMap.SimpleEntry<Integer, String>(0x00000001, "stand"),
          new AbstractMap.SimpleEntry<Integer, String>(0x00000002, "forward"),
          new AbstractMap.SimpleEntry<Integer, String>(0x00000004, "back"),
          new AbstractMap.SimpleEntry<Integer, String>(0x00000008, "dash"),
          new AbstractMap.SimpleEntry<Integer, String>(0x00000010, "sit"), // Immune to high
                                                                           // attacks.
          new AbstractMap.SimpleEntry<Integer, String>(0x00000020, "fuse"),
          new AbstractMap.SimpleEntry<Integer, String>(0x00000040, "ukemi"),
          new AbstractMap.SimpleEntry<Integer, String>(0x00000080, "kiri"),
          new AbstractMap.SimpleEntry<Integer, String>(0x00000100, "spmdmg"),
          new AbstractMap.SimpleEntry<Integer, String>(0x00000200, "slant"),
          new AbstractMap.SimpleEntry<Integer, String>(0x00000400, "quick"),
          new AbstractMap.SimpleEntry<Integer, String>(0x00000800, "float"),
          new AbstractMap.SimpleEntry<Integer, String>(0x00001000, "jump"),
          new AbstractMap.SimpleEntry<Integer, String>(0x00002000, "fall"),
          new AbstractMap.SimpleEntry<Integer, String>(0x00004000, "small"),
          new AbstractMap.SimpleEntry<Integer, String>(0x00008000, "damage"),
          new AbstractMap.SimpleEntry<Integer, String>(0x00010000, "downu"),
          new AbstractMap.SimpleEntry<Integer, String>(0x00020000, "downo"),
          new AbstractMap.SimpleEntry<Integer, String>(0x00040000, "getup"),
          new AbstractMap.SimpleEntry<Integer, String>(0x00080000, "turn"),
          new AbstractMap.SimpleEntry<Integer, String>(0x00100000, "tdown"),
          new AbstractMap.SimpleEntry<Integer, String>(0x00200000, "cantact"),
          new AbstractMap.SimpleEntry<Integer, String>(0x00400000, "sdef"), // Side defense.
          new AbstractMap.SimpleEntry<Integer, String>(0x00800000, "bdef"), // Back defense.
          new AbstractMap.SimpleEntry<Integer, String>(0x01000000, "beast"),
          new AbstractMap.SimpleEntry<Integer, String>(0x02000000, "uki"), // Note: if this is added
                                                                           // on an attacking move,
                                                                           // that move can no
                                                                           // longer Y cancel.
          new AbstractMap.SimpleEntry<Integer, String>(0x04000000, "butt"),
          new AbstractMap.SimpleEntry<Integer, String>(0x08000000, "ndown"),
          new AbstractMap.SimpleEntry<Integer, String>(0x10000000, "def"), // Defense from the
                                                                           // front. Like 4B guard.
          new AbstractMap.SimpleEntry<Integer, String>(0x20000000, "tfail"), // Missed throw
          new AbstractMap.SimpleEntry<Integer, String>(0x40000000, "throw"),
          new AbstractMap.SimpleEntry<Integer, String>(0x80000000, "attack"));

  // Mapping of a seq file offset to its associated action
  // Action = namedtuple("Action", ["id", "description"])
  public static final Map<Integer, Action> OFFSET_TO_ACTION = Map.ofEntries(
      new AbstractMap.SimpleEntry<Integer, Action>(0x030,
          new Action(0x000, "Do nothing (Freeze animations)")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x034, new Action(0x001, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x038, new Action(0x002, "Walk forward")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x03C, new Action(0x003, "Walk backwards")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x040, new Action(0x004, "Dash")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x044, new Action(0x005, "Run forward")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x048, new Action(0x006, "Quick dash forward")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x04C, new Action(0x007, "Quick dash backward")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x050,
          new Action(0x008, "Freeze character (Can be thrown out)")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x054, new Action(0x009, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x058, new Action(0x00A, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x05C, new Action(0x00B, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x060, new Action(0x00C, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x064, new Action(0x00D, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x068, new Action(0x00E, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x06C, new Action(0x00F, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x070, new Action(0x010, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x074, new Action(0x011, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x078, new Action(0x012, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x07C, new Action(0x013, "8B")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x080, new Action(0x014, "Jump")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x084, new Action(0x015, "Jump forward")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x088, new Action(0x016, "Jump backwards")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x08C, new Action(0x017, "Jump")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x090, new Action(0x018, "Jump forward")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x094, new Action(0x019, "Jump backwards")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x098, new Action(0x01A, "JB")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x09C, new Action(0x01B, "JB")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x0A0, new Action(0x01C, "JB")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x0A4, new Action(0x01D, "Land")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x0A8, new Action(0x01E, "L")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x0AC, new Action(0x01F, "R")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x0B0, new Action(0x020, "L (Dashing)")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x0B4, new Action(0x021, "R (Dashing)")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x0B8, new Action(0x022, "Land")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x0BC, new Action(0x023, "JB")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x0C0,
          new Action(0x024, "Freeze character (Can be thrown out)")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x0C4,
          new Action(0x025, "Transformation Y-cancel")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x0C8, new Action(0x026, "Hit out of air")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x0CC,
          new Action(0x027, "Freeze character (Can be thrown out)")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x0D0, new Action(0x028, "Intro Animation")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x0D4,
          new Action(0x029, "Disable all your attacks except throw")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x0D8,
          new Action(0x02A, "Win Animation (Disable all your attacks)")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x0DC,
          new Action(0x02B, "Win Animation (Including camera,  softlocks)")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x0E0,
          new Action(0x02C, "Win Animation (Including camera,  softlock")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x0E4,
          new Action(0x02D, "Missing animation? (softlock)")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x0E8,
          new Action(0x02E, "Lose round animation (softlock character)")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x0EC,
          new Action(0x02F, "Intro animation? (Can be thrown out,  only throws will work after)")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x0F0, new Action(0x030, "Crash")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x0F4, new Action(0x031, "Crash")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x0F8, new Action(0x032, "Crash")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x0FC, new Action(0x033, "Crash")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x100, new Action(0x034, "Crash")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x104, new Action(0x035, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x108, new Action(0x036, "Crash")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x10C, new Action(0x037, "Crash")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x110, new Action(0x038, "Crash")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x114,
          new Action(0x039, "Getting hit animation")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x118,
          new Action(0x03A, "Getting hit animation")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x11C,
          new Action(0x03B, "Getting hit animation")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x120,
          new Action(0x03C, "Getting hit animation")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x124,
          new Action(0x03D, "Getting hit animation")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x128,
          new Action(0x03E, "Getting hit animation")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x12C,
          new Action(0x03F, "Getting hit animation")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x130,
          new Action(0x040, "Getting hit animation")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x134,
          new Action(0x041, "Getting hit animation")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x138,
          new Action(0x042, "Getting hit animation")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x13C,
          new Action(0x043, "Getting hit animation")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x140,
          new Action(0x044, "Getting hit animation")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x144,
          new Action(0x045, "Getting hit animation")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x148,
          new Action(0x046, "Hard knockdown animation")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x14C,
          new Action(0x047, "Hard knockdown animation")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x150,
          new Action(0x048, "Round loss animation")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x154,
          new Action(0x049, "Hard knockdown animation")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x158,
          new Action(0x04A, "Hard knockdown animation")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x15C,
          new Action(0x04B, "Hit with Special (lose all chakra)")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x160,
          new Action(0x04C,
              "Hit with hiki2 (Sink into the ground and fall from above. Ex, Shika 2X)")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x164,
          new Action(0x04D, "Hit with hiki (Sink into the ground and pop out. Ex, Jiraya 2A)")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x168,
          new Action(0x04E, "Hit with mato2 (Trapped. Ex, Shino 2A)")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x16C, new Action(0x04F, "Hit hard")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x170,
          new Action(0x050, "Hit and stuck in air (Can be hit out)")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x174,
          new Action(0x051, "Hit and stuck in air (Can be hit out)")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x178,
          new Action(0x052, "Hit with yoro2 (Feet trapped. Ex, Kidomaru 5A1C)")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x17C, new Action(0x053, "Hit hard")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x180,
          new Action(0x054, "Hit and stuck in air (Can be hit out)")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x184,
          new Action(0x055, "Hit and stuck in air (Can be hit out)")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x188,
          new Action(0x056, "Hit and stuck in air (Can be hit out)")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x18C,
          new Action(0x057, "Hit and stuck in air (Can be hit out)")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x190,
          new Action(0x058, "Hit and stuck in air (Can be hit out)")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x194,
          new Action(0x059, "Hit and stuck in air (Can be hit out)")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x198,
          new Action(0x05A, "Hit and stuck in ground (Can be hit out)")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x19C,
          new Action(0x05B, "Hit and stuck in air (Can be hit out)")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x1A0, new Action(0x05C, "Hit hard")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x1A4, new Action(0x05D, "Hard knockdown")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x1A8, new Action(0x05E,
          "Hit with Furi (Turns opponents around on hit. Leftover from Bloody Roar; not used.)")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x1AC, new Action(0x05F,
          "Hit with Furi (Turns opponents around on hit. Leftover from Bloody Roar; not used.)")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x1B0,
          new Action(0x060, "Hit and stuck in air (Can be hit out)")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x1B4, new Action(0x061, "Hard knockdown")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x1B8, new Action(0x062, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x1BC, new Action(0x063, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x1C0, new Action(0x064, "Crash")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x1C4, new Action(0x065, "Crash")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x1C8, new Action(0x066, "Hard knockdown")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x1CC, new Action(0x067, "Getting hit")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x1D0, new Action(0x068, "Getting hit")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x1D4, new Action(0x069, "Hard knockdown")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x1D8, new Action(0x06A, "Hard knockdown")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x1DC, new Action(0x06B, "Guard break")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x1E0, new Action(0x06C, "Hard knockdown")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x1E4, new Action(0x06D, "Getting hit")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x1E8, new Action(0x06E, "Getting hit")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x1EC, new Action(0x06F, "Hard knockdown")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x1F0, new Action(0x070, "Hard knockdown")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x1F4, new Action(0x071, "Getting hit")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x1F8, new Action(0x072, "Roll forward")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x1FC, new Action(0x073, "Roll forward")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x200, new Action(0x074, "Roll backwards")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x204, new Action(0x075, "Roll right")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x208, new Action(0x076, "Roll left")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x20C, new Action(0x077, "Get up")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x210, new Action(0x078, "Get up roll forward")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x214, new Action(0x079, "Get up roll forward")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x218,
          new Action(0x07A, "Get up roll backwards")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x21C, new Action(0x07B, "Get up roll right")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x220, new Action(0x07C, "Get up roll left")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x224, new Action(0x07D, "Throw break 1")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x228, new Action(0x07E, "Throw break 1")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x22C, new Action(0x07F, "Throw break 2")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x230, new Action(0x080, "Hit hard")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x234, new Action(0x081, "Hit hard")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x238, new Action(0x082, "Hit hard")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x23C, new Action(0x083, "Hit hard")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x240,
          new Action(0x084, "Hard knockdown to the left")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x244,
          new Action(0x085, "Hard knockdown to the right")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x248, new Action(0x086, "Getting hit")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x24C, new Action(0x087, "Getting hit")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x250, new Action(0x088, "Hard knockdown back")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x254,
          new Action(0x089, "Hard knockdown forward")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x258, new Action(0x08A, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x25C, new Action(0x08B, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x260, new Action(0x08C, "Hit hard")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x264, new Action(0x08D, "Tripping")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x268,
          new Action(0x08E, "Hard knockdown bounce")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x26C,
          new Action(0x08F, "Hard knockdown bounce")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x270,
          new Action(0x090, "Hit and stuck in air (Can be hit out)")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x274,
          new Action(0x091, "Hit and stuck in air (Can be hit out)")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x278,
          new Action(0x092, "Hard knockdown slow bounce")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x27C,
          new Action(0x093, "Hard knockdown slow bounce")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x280, new Action(0x094, "Crash")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x284, new Action(0x095, "Block low")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x288, new Action(0x096, "Get up")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x28C, new Action(0x097, "Guard break low")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x290, new Action(0x098, "Weird land")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x294, new Action(0x099, "Weird land")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x298, new Action(0x09A, "Weird land")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x29C, new Action(0x09B, "Weird land")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x2A0, new Action(0x09C, "Weird land")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x2A4, new Action(0x09D, "Weird land")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x2A8, new Action(0x09E, "Weird land")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x2AC, new Action(0x09F, "Weird land")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x2B0, new Action(0x0A0, "5B")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x2B4, new Action(0x0A1, "6B")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x2B8, new Action(0x0A2, "4B")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x2BC, new Action(0x0A3, "2B")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x2C0, new Action(0x0A4, "DB")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x2C4, new Action(0x0A5, "DB")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x2C8, new Action(0x0A6, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x2CC, new Action(0x0A7, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x2D0, new Action(0x0A8, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x2D4, new Action(0x0A9, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x2D8, new Action(0x0AA, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x2DC, new Action(0x0AB, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x2E0, new Action(0x0AC, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x2E4, new Action(0x0AD, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x2E8, new Action(0x0AE, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x2EC, new Action(0x0AF, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x2F0, new Action(0x0B0, "5A")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x2F4, new Action(0x0B1, "6A")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x2F8, new Action(0x0B2, "4A")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x2FC, new Action(0x0B3, "2A")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x300, new Action(0x0B4, "DA")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x304, new Action(0x0B5, "DA")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x308, new Action(0x0B6, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x30C, new Action(0x0B7, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x310, new Action(0x0B8, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x314, new Action(0x0B9, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x318, new Action(0x0BA, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x31C, new Action(0x0BB, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x320, new Action(0x0BC, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x324, new Action(0x0BD, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x328, new Action(0x0BE, "Weird land")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x32C,
          new Action(0x0BF, "Stuck in air (Can be hit out)")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x330, new Action(0x0C0, "RKnJ (Ground)")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x334, new Action(0x0C1, "RKnJ (Air)")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x338, new Action(0x0C2, "LKnJ")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x33C, new Action(0x0C3, "ZKnJ incoming")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x340, new Action(0x0C4, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x344, new Action(0x0C5, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x348, new Action(0x0C6, "5Z outgoing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x34C, new Action(0x0C7, "4Z incoming")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x350, new Action(0x0C8, "5Z incoming")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x354,
          new Action(0x0C9, "Become invisible (revert when hit)")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x358, new Action(0x0CA, "Z switch")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x35C, new Action(0x0CB, "ZKnJ outgoing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x360,
          new Action(0x0CC, "Teleport behind opponent")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x364, new Action(0x0CD, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x368, new Action(0x0CE, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x36C, new Action(0x0CF, "4Z outgoing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x370, new Action(0x0D0, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x374, new Action(0x0D1, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x378, new Action(0x0D2, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x37C, new Action(0x0D3, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x380, new Action(0x0D4, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x384, new Action(0x0D5, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x388, new Action(0x0D6, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x38C, new Action(0x0D7, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x390, new Action(0x0D8, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x394, new Action(0x0D9, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x398, new Action(0x0DA, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x39C, new Action(0x0DB, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x3A0, new Action(0x0DC, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x3A4, new Action(0x0DD, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x3A8, new Action(0x0DE, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x3AC, new Action(0x0DF, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x3B0, new Action(0x0E0, "JB")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x3B4, new Action(0x0E1, "JA")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x3B8, new Action(0x0E2, "8B")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x3BC, new Action(0x0E3, "8A")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x3C0, new Action(0x0E4, "Hit with smoke")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x3C4, new Action(0x0E5, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x3C8, new Action(0x0E6, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x3CC, new Action(0x0E7, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x3D0, new Action(0x0E8, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x3D4, new Action(0x0E9, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x3D8, new Action(0x0EA, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x3DC, new Action(0x0EB, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x3E0, new Action(0x0EC, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x3E4, new Action(0x0ED, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x3E8, new Action(0x0EE, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x3EC, new Action(0x0EF, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x3F0, new Action(0x0F0, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x3F4, new Action(0x0F1, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x3F8, new Action(0x0F2, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x3FC, new Action(0x0F3, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x400, new Action(0x0F4, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x404, new Action(0x0F5, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x408, new Action(0x0F6, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x40C, new Action(0x0F7, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x410, new Action(0x0F8, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x414, new Action(0x0F9, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x418, new Action(0x0FA, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x41C, new Action(0x0FB, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x420, new Action(0x0FC, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x424, new Action(0x0FD, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x428,
          new Action(0x0FE, "Stuck in air (Can be hit out)")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x42C, new Action(0x0FF, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x430, new Action(0x100, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x434, new Action(0x101, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x438, new Action(0x102, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x43C, new Action(0x103, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x440, new Action(0x104, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x444, new Action(0x105, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x448, new Action(0x106, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x44C, new Action(0x107, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x450, new Action(0x108, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x454, new Action(0x109, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x458,
          new Action(0x10A, "Stuck in air (Can be hit out)")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x45C, new Action(0x10B, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x460, new Action(0x10C, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x464, new Action(0x10D, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x468, new Action(0x10E, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x46C, new Action(0x10F, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x470, new Action(0x110, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x474, new Action(0x111, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x478, new Action(0x112, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x47C, new Action(0x113, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x480, new Action(0x114, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x484, new Action(0x115, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x488,
          new Action(0x116, "Stuck in air (Can be hit out)")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x48C, new Action(0x117, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x490, new Action(0x118, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x494, new Action(0x119, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x498, new Action(0x11A, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x49C, new Action(0x11B, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x4A0, new Action(0x11C, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x4A4, new Action(0x11D, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x4A8, new Action(0x11E, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x4AC, new Action(0x11F, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x4B0,
          new Action(0x120, "Stuck in air (Can be hit out)")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x4B4, new Action(0x121, "5X")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x4B8, new Action(0x122, "2X")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x4BC, new Action(0x123, "5X (Transformation)")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x4C0, new Action(0x124, "Transform")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x4C4, new Action(0x125, "2X (Animation)")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x4C8,
          new Action(0x126, "Do nothing (head movement?)")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x4CC,
          new Action(0x127, "Do nothing (head movement?)")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x4D0,
          new Action(0x128, "Remove character from game")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x4D4, new Action(0x129, "3-Man X #1")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x4D8, new Action(0x12A, "3-Man X #2")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x4DC, new Action(0x12B, "3-Man X #3")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x4E0, new Action(0x12C, "3-Man X #4")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x4E4, new Action(0x12D, "3-Man X #5")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x4E8, new Action(0x12E, "3-Man X #6")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x4EC, new Action(0x12F, "3-Man X #7")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x4F0,
          new Action(0x130, "Combo Moves (character-specific)")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x4F4,
          new Action(0x131, "Combo Moves (character-specific)")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x4F8,
          new Action(0x132, "Combo Moves (character-specific)")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x4FC,
          new Action(0x133, "Combo Moves (character-specific)")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x500,
          new Action(0x134, "Combo Moves (character-specific)")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x504,
          new Action(0x135, "Combo Moves (character-specific)")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x508,
          new Action(0x136, "Combo Moves (character-specific)")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x50C,
          new Action(0x137, "Combo Moves (character-specific)")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x510,
          new Action(0x138, "Combo Moves (character-specific)")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x514,
          new Action(0x139, "Combo Moves (character-specific)")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x518,
          new Action(0x13A, "Combo Moves (character-specific)")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x51C,
          new Action(0x13B, "Combo Moves (character-specific)")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x520,
          new Action(0x13C, "Combo Moves (character-specific)")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x524,
          new Action(0x13D, "Combo Moves (character-specific)")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x528,
          new Action(0x13E, "Combo Moves (character-specific)")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x52C,
          new Action(0x13F, "Combo Moves (character-specific)")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x530,
          new Action(0x140, "Combo Moves (character-specific)")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x534,
          new Action(0x141, "Combo Moves (character-specific)")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x538,
          new Action(0x142, "Combo Moves (character-specific)")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x53C,
          new Action(0x143, "Combo Moves (character-specific)")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x540,
          new Action(0x144, "Combo Moves (character-specific)")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x544,
          new Action(0x145, "Combo Moves (character-specific)")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x548,
          new Action(0x146, "Combo Moves (character-specific)")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x54C,
          new Action(0x147, "Combo Moves (character-specific)")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x550,
          new Action(0x148, "Combo Moves (character-specific)")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x554,
          new Action(0x149, "Combo Moves (character-specific)")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x558, new Action(0x14A, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x55C, new Action(0x14B, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x560, new Action(0x14C, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x564, new Action(0x14D, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x568, new Action(0x14E, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x56C, new Action(0x14F, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x570, new Action(0x150, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x574, new Action(0x151, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x578, new Action(0x152, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x57C, new Action(0x153, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x580, new Action(0x154, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x584, new Action(0x155, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x588, new Action(0x156, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x58C, new Action(0x157, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x590, new Action(0x158, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x594, new Action(0x159, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x598, new Action(0x15A, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x59C, new Action(0x15B, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x5A0, new Action(0x15C, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x5A4, new Action(0x15D, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x5A8, new Action(0x15E, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x5AC, new Action(0x15F, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x5B0, new Action(0x160, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x5B4, new Action(0x161, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x5B8, new Action(0x162, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x5BC, new Action(0x163, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x5C0, new Action(0x164, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x5C4, new Action(0x165, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x5C8, new Action(0x166, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x5CC, new Action(0x167, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x5D0, new Action(0x168, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x5D4, new Action(0x169, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x5D8, new Action(0x16A, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x5DC, new Action(0x16B, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x5E0, new Action(0x16C, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x5E4, new Action(0x16D, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x5E8, new Action(0x16E, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x5EC, new Action(0x16F, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x5F0, new Action(0x170, "Crash")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x5F4, new Action(0x171, "Crash")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x5F8, new Action(0x172, "Crash")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x5FC, new Action(0x173, "Crash")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x600, new Action(0x174, "Crash")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x604, new Action(0x175, "Crash")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x608, new Action(0x176, "Crash")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x60C, new Action(0x177, "Crash")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x610, new Action(0x178, "Crash")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x614, new Action(0x179, "Crash")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x618, new Action(0x17A, "Crash")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x61C, new Action(0x17B, "Crash")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x620, new Action(0x17C, "Crash")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x624, new Action(0x17D, "Crash")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x628, new Action(0x17E, "Crash")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x62C, new Action(0x17F, "Crash")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x630, new Action(0x180, "Crash")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x634, new Action(0x181, "Crash")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x638, new Action(0x182, "Crash")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x63C, new Action(0x183, "Crash")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x640, new Action(0x184, "Crash")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x644, new Action(0x185, "Crash")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x648, new Action(0x186, "Crash")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x64C, new Action(0x187, "Crash")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x650, new Action(0x188, "Crash")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x654, new Action(0x189, "Crash")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x658, new Action(0x18A, "Crash")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x65C, new Action(0x18B, "Crash")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x660, new Action(0x18C, "Crash")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x664, new Action(0x18D, "Crash")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x668, new Action(0x18E, "Crash")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x66C, new Action(0x18F, "Crash")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x670, new Action(0x190, "Ground Throw")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x674, new Action(0x191, "Back Ground Throw")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x678, new Action(0x192, "Air Throw")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x67C, new Action(0x193, "Activated X")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x680, new Action(0x194, "Crash")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x684,
          new Action(0x195, "Activated X (Transformation)")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x688, new Action(0x196, "Activated 2X")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x68C, new Action(0x197, "Crash")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x690, new Action(0x198, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x694, new Action(0x199, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x698, new Action(0x19A, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x69C, new Action(0x19B, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x6A0, new Action(0x19C, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x6A4, new Action(0x19D, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x6A8, new Action(0x19E, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x6AC, new Action(0x19F, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x6B0, new Action(0x1A0, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x6B4, new Action(0x1A1, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x6B8, new Action(0x1A2, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x6BC, new Action(0x1A3, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x6C0, new Action(0x1A4, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x6C4, new Action(0x1A5, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x6C8, new Action(0x1A6, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x6CC, new Action(0x1A7, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x6D0, new Action(0x1A8, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x6D4, new Action(0x1A9, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x6D8, new Action(0x1AA, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x6DC, new Action(0x1AB, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x6E0, new Action(0x1AC, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x6E4, new Action(0x1AD, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x6E8, new Action(0x1AE, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x6EC, new Action(0x1AF, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x6F0, new Action(0x1B0, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x6F4, new Action(0x1B1, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x6F8, new Action(0x1B2, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x6FC, new Action(0x1B3, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x700, new Action(0x1B4, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x704, new Action(0x1B5, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x708, new Action(0x1B6, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x70C, new Action(0x1B7, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x710, new Action(0x1B8, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x714, new Action(0x1B9, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x718, new Action(0x1BA, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x71C, new Action(0x1BB, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x720, new Action(0x1BC, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x724, new Action(0x1BD, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x728, new Action(0x1BE, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x72C, new Action(0x1BF, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x730, new Action(0x1C0, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x734, new Action(0x1C1, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x738, new Action(0x1C2, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x73C, new Action(0x1C3, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x740, new Action(0x1C4, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x744, new Action(0x1C5, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x748, new Action(0x1C6, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x74C, new Action(0x1C7, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x750, new Action(0x1C8, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x754, new Action(0x1C9, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x758, new Action(0x1CA, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x75C, new Action(0x1CB, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x760, new Action(0x1CC, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x764, new Action(0x1CD, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x768, new Action(0x1CE, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x76C, new Action(0x1CF, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x770,
          new Action(0x1D0, "Activated 3-Man X #1")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x774,
          new Action(0x1D1, "Activated 3-Man X #2")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x778,
          new Action(0x1D2, "Activated 3-Man X #3")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x77C,
          new Action(0x1D3, "Activated 3-Man X #4")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x780, new Action(0x1D4, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x784,
          new Action(0x1D5, "Activated 3-Man X #5")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x788, new Action(0x1D6, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x78C, new Action(0x1D7, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x790, new Action(0x1D8, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x794, new Action(0x1D9, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x798, new Action(0x1DA, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x79C, new Action(0x1DB, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x7A0, new Action(0x1DC, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x7A4, new Action(0x1DD, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x7A8, new Action(0x1DE, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x7AC,
          new Action(0x1DF, "Activated 3-Man X #6")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x7B0, new Action(0x1E0, "Getting thrown")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x7B4, new Action(0x1E1, "Getting thrown")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x7B8,
          new Action(0x1E2, "Thrown on the ground")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x7BC, new Action(0x1E3, "Hit by super")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x7C0, new Action(0x1E4, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x7C4, new Action(0x1E5, "Hit by small attack")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x7C8, new Action(0x1E6, "Hit by super")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x7CC, new Action(0x1E7, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x7D0, new Action(0x1E8, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x7D4, new Action(0x1E9, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x7D8, new Action(0x1EA, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x7DC, new Action(0x1EB, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x7E0, new Action(0x1EC, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x7E4, new Action(0x1ED, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x7E8, new Action(0x1EE, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x7EC, new Action(0x1EF, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x7F0, new Action(0x1F0, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x7F4, new Action(0x1F1, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x7F8, new Action(0x1F2, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x7FC, new Action(0x1F3, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x800, new Action(0x1F4, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x804, new Action(0x1F5, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x808, new Action(0x1F6, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x80C, new Action(0x1F7, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x810, new Action(0x1F8, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x814, new Action(0x1F9, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x818, new Action(0x1FA, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x81C, new Action(0x1FB, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x820, new Action(0x1FC, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x824, new Action(0x1FD, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x828, new Action(0x1FE, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x82C, new Action(0x1FF, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x830, new Action(0x200, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x834, new Action(0x201, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x838, new Action(0x202, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x83C, new Action(0x203, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x840, new Action(0x204, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x844, new Action(0x205, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x848, new Action(0x206, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x84C, new Action(0x207, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x850, new Action(0x208, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x854, new Action(0x209, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x858, new Action(0x20A, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x85C, new Action(0x20B, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x860, new Action(0x20C, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x864, new Action(0x20D, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x868, new Action(0x20E, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x86C, new Action(0x20F, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x870, new Action(0x210, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x874, new Action(0x211, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x878, new Action(0x212, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x87C, new Action(0x213, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x880, new Action(0x214, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x884, new Action(0x215, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x888, new Action(0x216, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x88C, new Action(0x217, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x890, new Action(0x218, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x894, new Action(0x219, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x898, new Action(0x21A, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x89C, new Action(0x21B, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x8A0, new Action(0x21C, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x8A4, new Action(0x21D, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x8A8, new Action(0x21E, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x8AC, new Action(0x21F, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x8B0, new Action(0x220, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x8B4, new Action(0x221, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x8B8, new Action(0x222, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x8BC,
          new Action(0x223, "Getting hit by super")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x8C0, new Action(0x224, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x8C4,
          new Action(0x225, "Getting hit by super")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x8C8, new Action(0x226, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x8CC, new Action(0x227, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x8D0, new Action(0x228, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x8D4, new Action(0x229, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x8D8, new Action(0x22A, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x8DC, new Action(0x22B, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x8E0, new Action(0x22C, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x8E4, new Action(0x22D, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x8E8, new Action(0x22E, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x8EC, new Action(0x22F, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x8F0, new Action(0x230, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x8F4, new Action(0x231, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x8F8, new Action(0x232, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x8FC, new Action(0x233, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x900, new Action(0x234, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x904, new Action(0x235, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x908, new Action(0x236, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x90C, new Action(0x237, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x910, new Action(0x238, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x914, new Action(0x239, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x918, new Action(0x23A, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x91C, new Action(0x23B, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x920, new Action(0x23C, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x924, new Action(0x23D, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x928, new Action(0x23E, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x92C, new Action(0x23F, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x930, new Action(0x240, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x934, new Action(0x241, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x938, new Action(0x242, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x93C, new Action(0x243, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x940, new Action(0x244, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x944, new Action(0x245, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x948, new Action(0x246, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x94C, new Action(0x247, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x950, new Action(0x248, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x954, new Action(0x249, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x958, new Action(0x24A, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x95C, new Action(0x24B, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x960, new Action(0x24C, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x964, new Action(0x24D, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x968, new Action(0x24E, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x96C, new Action(0x24F, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x970, new Action(0x250, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x974, new Action(0x251, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x978, new Action(0x252, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x97C, new Action(0x253, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x980, new Action(0x254, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x984, new Action(0x255, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x988, new Action(0x256, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x98C, new Action(0x257, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x990, new Action(0x258, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x994, new Action(0x259, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x998, new Action(0x25A, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x99C, new Action(0x25B, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x9A0, new Action(0x25C, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x9A4, new Action(0x25D, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x9A8, new Action(0x25E, "Do nothing")),
      new AbstractMap.SimpleEntry<Integer, Action>(0x9AC, new Action(0x25F, "Do nothing")));

}
